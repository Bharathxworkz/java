package com.xworkz.app.service;

import com.xworkz.app.constant.MessageConstant;
import com.xworkz.app.constant.ServiceConstant;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    MailService mailService;

    @Override
    public boolean save(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);
        userEntity.setCreatedBy(userDto.getContactPerson());
        userEntity.setCreatedDate(LocalDate.now());

        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
        System.out.println(userEntity);
        if (userRepository.save(userEntity)) {
            mailService.sendRegistrationMessage("Registration", "Thank you for Registering with us", userDto.getEmail());
            return true;
        }
        return false;
    }

    @Override
    public UserDto getUserByEmailAndPassword(String email, String password) {
        UserEntity userEntity = userRepository.getUserByEmailAndPassword(email);
        UserDto userDto = new UserDto();
        if (userEntity != null && userEntity.getEmail() != null && userEntity.getEmail().equalsIgnoreCase(email) && userEntity.getPassword() != null && passwordEncoder.matches(password, userEntity.getPassword())) {
            BeanUtils.copyProperties(userEntity, userDto);
            log.info("dto : {} ", userDto);

            return userDto;
        } else
            return new UserDto();
    }

    @Override
    public boolean updatePasswordByEmail(String email, String newPassword) {
        UserEntity userEntity = userRepository.getDtoByEmail(email);
        userEntity.setPassword(passwordEncoder.encode(newPassword));
        //  userEntity.setConfirmPassword(userEntity.getConfirmPassword());
        UserEntity updateEntity = userRepository.updateProfile(userEntity);
        if (updateEntity != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validateOtp(String otp, String email) {
        UserEntity mediSaleEntity = userRepository.getDtoByEmail(email);
        log.info("medisaleEntity: {} ", mediSaleEntity);
        if (mediSaleEntity != null && mediSaleEntity.getEmail() != null && mediSaleEntity.getEmail().equalsIgnoreCase(email) && mediSaleEntity.getOtp() != null && passwordEncoder.matches(otp, mediSaleEntity.getOtp().toString())) {
            log.info(MessageConstant.OTP_VALIDATE_SUCCESS_MESSAGE.getMessage());
            return true;
        } else {
            log.info(MessageConstant.OTP_VALIDATE_REJECT_MESSAGE.getMessage());
            return false;
        }
    }

    @Override
    public UserDto updateProfile(UserDto mediSaleDto,UserDto sessionDto, MultipartFile multipartFile) {
        if (multipartFile.isEmpty()){
            log.info("File is empty");
        }
        else {
            try {
                byte[] bytes = multipartFile.getBytes();
                Path path = Paths.get(ServiceConstant.FILE_PATH.getPath() + multipartFile.getOriginalFilename());
                Files.write(path,bytes);
            } catch (IOException e) {
                log.info("{}",e.getMessage());
            }
        }
        log.info("Running Update Profile");
        //UserEntity userEntityById = userRepository.getUserById(userDto.getId());
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(mediSaleDto,userEntity);

        userEntity.setEmail(sessionDto.getEmail());
        userEntity.setAddress2(sessionDto.getAddress2());
        userEntity.setPincode(sessionDto.getPincode());
        userEntity.setOtp(sessionDto.getOtp());
        userEntity.setPassword(sessionDto.getPassword());
        userEntity.setConfirmPassword(sessionDto.getConfirmPassword());
        userEntity.setCreatedBy(sessionDto.getCreatedBy());
        userEntity.setCreatedDate(sessionDto.getCreatedDate());
        userEntity.setUpdatedBy(mediSaleDto.getContactPerson());
        userEntity.setUpdatedDate(LocalDate.now());
        userEntity.setFileName(multipartFile.getOriginalFilename());
        userEntity.setContentType(multipartFile.getContentType());
        log.info("Invoke update profile into repo");
        UserEntity entity = userRepository.updateProfile(userEntity);
        UserDto dto1 = new UserDto();
        log.info("Data is updated");

        BeanUtils.copyProperties(entity,dto1);

        log.info("Session dto is : {} ", sessionDto);

        return dto1;
    }

    @Override
    public UserDto getUserById(Integer id) {
        UserEntity userEntity = userRepository.getUserById(id);
        UserDto userDto = new UserDto();
        if (userEntity!=null) {
            BeanUtils.copyProperties(userEntity, userDto);
            return userDto;
        }else {
            return null;
        }
    }
}
