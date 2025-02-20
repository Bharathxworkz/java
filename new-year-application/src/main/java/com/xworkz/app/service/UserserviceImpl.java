package com.xworkz.app.service;

import com.xworkz.app.constants.MessageConstant;
import com.xworkz.app.constants.ServiceConstant;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserserviceImpl implements Userservice{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MailService mailService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public boolean save(UserDto userDto) {
        if (userRepository.checkEmail(userDto.getEmail()) || userRepository.checkPhoneNumber(userDto.getContactNumber())){
            return false;
        } else {
            UserEntity userEntity = new UserEntity();
//            userDto.setCratedBy(userDto.getFName());
//            userDto.setCreatedTime(LocalDate.now());
            BeanUtils.copyProperties(userDto, userEntity);
            userEntity.setCratedBy(userDto.getFName());
            userEntity.setCreatedTime(LocalDate.now());
            userEntity.setFileName("blank.png");
            userEntity.setContentType("JPG/png");
            userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
            if (userRepository.save(userEntity)){
                mailService.sendRegistrationMessage("Registration","Thank you for Registering with us",userDto.getEmail());
                return true;
            }
            return false;
        }
    }

    @Override
    public UserDto getUserByEmailAndPassword(String email,String password) {
        UserEntity userEntity= userRepository.getUserByEmailAndPassword(email);
        UserDto userDto = new UserDto();
        if (userEntity!=null && userEntity.getEmail()!=null && userEntity.getEmail().equalsIgnoreCase(email) && userEntity.getPassword()!=null && passwordEncoder.matches(password,userEntity.getPassword())){
            BeanUtils.copyProperties(userEntity,userDto);
            log.info("dto : {} " , userDto);
            userEntity.setAttempt(0);
            userRepository.updateProfile(userEntity);
            return userDto;
        } else {
            UserEntity userEntity1=userRepository.getDtoByEmail(email);
            log.info("new year entity{}", userEntity1);
            userEntity1.setAttempt(userEntity1.getAttempt()+1);
            log.info("{}",userEntity1);
            userRepository.updateProfile(userEntity1);
            userDto.setAttempt(userEntity1.getAttempt());
            log.info("User dtooo : {} " , userDto);
            return userDto;
        }
    }
    @Override
    public boolean updatePasswordByEmail(String email, String newPassword){
        UserEntity userEntity =userRepository.getDtoByEmail(email);
        userEntity.setPassword(passwordEncoder.encode(newPassword));
           UserEntity updateEntity =   userRepository.updateProfile(userEntity);
           if(updateEntity != null){
               return true;
           }
           else {
               return false;
           }
    }

    @Override
    public UserEntity getDtoByEmail(String email) {
        return userRepository.getDtoByEmail(email);
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

    @Override
    public UserDto updateProfile(UserDto userDto, UserDto sessionDto, MultipartFile multipartFile) {

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
        BeanUtils.copyProperties(userDto,userEntity);

        userEntity.setEmail(sessionDto.getEmail());
        userEntity.setAlterEmail(sessionDto.getAlterEmail());
        userEntity.setPassword(sessionDto.getPassword());
        userEntity.setConfirmPassword(sessionDto.getConfirmPassword());
        userEntity.setCratedBy(sessionDto.getCratedBy());
        userEntity.setCreatedTime(sessionDto.getCreatedTime());
        userEntity.setUpdatedBy(userDto.getFName());
        userEntity.setUpdatedTime(LocalDate.now());
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
    public List<UserDto> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean validateOtp(String otp, String email) {
        UserEntity userEntity = userRepository.getDtoByEmail(email);
        log.info("userentity: {} " , userEntity);
        if (userEntity!=null && userEntity.getEmail()!=null && userEntity.getEmail().equalsIgnoreCase(email) && userEntity.getOtp()!=null && passwordEncoder.matches(otp,userEntity.getOtp().toString())){
            log.info(MessageConstant.OTP_VALIDATE_SUCCESS_MESSAGE.getMessage());
            return true;
        }else {
            log.info(MessageConstant.OTP_VALIDATE_REJECT_MESSAGE.getMessage());
            return false;
        }
    }


}
