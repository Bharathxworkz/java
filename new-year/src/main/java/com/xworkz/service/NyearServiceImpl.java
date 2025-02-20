package com.xworkz.service;

import com.xworkz.constant.ServiceConstant;
import com.xworkz.dto.NyearDto;
import com.xworkz.entity.NyearEntity;
import com.xworkz.repository.NyearRepository;
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

@Slf4j
@Service
public class NyearServiceImpl implements NyearService{

    @Autowired
     private NyearRepository nyearRepository;
     @Autowired
    private MailService mailService;
     @Autowired
     private PasswordEncoder passwordEncoder;

    @Override
    public boolean save(NyearDto nyearDto) {
        if (nyearRepository.checkEmail(nyearDto.getEmail())) {
            return false;
        } else {
            NyearEntity entity = new NyearEntity();
            nyearDto.setPassword(passwordEncoder.encode(nyearDto.getPassword()));
            BeanUtils.copyProperties(nyearDto, entity);
            entity.setCreatedBy(nyearDto.getFirstName());
            entity.setCreatedTime(LocalDate.now());
            entity.setFileName("blank.jpg");
            entity.setContentType("jpg/png");

            System.out.println(entity);
            if (nyearRepository.save(entity)) {
                System.out.println("Maiil Sent");
                mailService.sendRegistrationMessage("Registration","Thank you for Registerinh", nyearDto.getEmail());
                return true;

            }
                return false;

        }
    }
    @Override
    public NyearDto getDtoByEmail(String email , String password) {
        NyearEntity nyearEntity = nyearRepository.getDtoByEmail( email);
        NyearDto nyearDto = new NyearDto();
        if(nyearEntity !=null&& nyearEntity.getEmail()!=null&& nyearEntity.getEmail().equalsIgnoreCase(email)
        &&nyearEntity.getPassword() !=null && passwordEncoder.matches(password,nyearEntity.getPassword())) {
            BeanUtils.copyProperties(nyearEntity, nyearDto);
            return nyearDto;
        }else {
            return nyearDto;
        }
    }

    @Override
    public void updatePasswordByEmail(String email, String newPassword, String confirmPassword) {
        nyearRepository.updatePasswordByEmail( email, newPassword, confirmPassword);
    }

    @Override
    public NyearDto checkEmail(String email) {
        NyearEntity nyearEntity = nyearRepository.getEmail(email);
        NyearDto nyearDto = new NyearDto();
        if(nyearEntity !=null&& nyearEntity.getEmail()!=null&& nyearEntity.getEmail().equalsIgnoreCase(email)
                &&nyearEntity.getPassword() !=null ) {
            BeanUtils.copyProperties(nyearEntity, nyearDto);
            return nyearDto;
        }else {
            return nyearDto;
        }
    }

    @Override
    public NyearDto getById(int id) {
        NyearDto dto = new NyearDto();
      NyearEntity nyearEntity =  nyearRepository.getById(id);
      if (nyearEntity != null){
          BeanUtils.copyProperties(nyearEntity,dto);
          return dto;
      }
        return null;
    }

    @Override
    public NyearDto updatedatata(NyearDto nyearDto, NyearDto sessionDto, MultipartFile multipartFile) {
        if(multipartFile.isEmpty()){
            log.info("file is emplty");
        }else {
            try{
              byte [] bytes  =multipartFile.getBytes();
                Path path = Paths.get(ServiceConstant.FIlE_PATH.getPath() + multipartFile.getOriginalFilename());
                Files.write(path,bytes);
            }catch (IOException e){
                log.info("{}",e.getMessage());
            }

        }

        NyearEntity nyearEntity = new NyearEntity();
        BeanUtils.copyProperties(nyearDto,nyearEntity);
        System.out.println(sessionDto);
        nyearEntity.setPassword(sessionDto.getPassword());
        nyearEntity.setConfirmPassword(sessionDto.getConfirmPassword());
        nyearEntity.setCreatedBy(sessionDto.getCreatedBy());
        nyearEntity.setCreatedTime(sessionDto.getCreatedTime());
        nyearEntity.setUpdatedBy(nyearDto.getFirstName());
        nyearEntity.setUpdatedTime(LocalDate.now());
        nyearEntity.setFileName(multipartFile.getOriginalFilename());
        nyearEntity.setContentType(multipartFile.getContentType());
        log.info(String.valueOf(nyearEntity));
      NyearEntity entity =  nyearRepository.updatedatata(nyearEntity);
      NyearDto dto = new NyearDto();
      log.info("Data is updated");
      BeanUtils.copyProperties(entity,dto);
      return dto;
    }


}
