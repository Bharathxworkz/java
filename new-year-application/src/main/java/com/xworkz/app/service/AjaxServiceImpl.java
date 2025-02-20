package com.xworkz.app.service;

import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class AjaxServiceImpl implements AjaxService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    MailService mailService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public String checkEmail(String email) {
        boolean exists = userRepository.checkEmail(email);
        if (exists){
            return "Email Exists";
        }
        return "Email does not Exist";
    }

    @Override
    public String checkPhoneNumber(Long phoneNumber) {
        boolean exists = userRepository.checkPhoneNumber(phoneNumber);
        if (exists){
            return "PhoneNumber Exists";
        }
        return "PhoneNumber does not exists";
    }

    @Override
    public String sendOtp(String email) {
        UserEntity userEntity = userRepository.getDtoByEmail(email);
        System.err.println(userEntity);
        if (userEntity.getEmail()!=null){
            Random random = new Random();
            Integer otp = random.nextInt(999999);
            log.info("Your Otp is {} ", otp);
            mailService.sendRegistrationMessage("OTP verification"," your otp is :: "+otp,email);
            userEntity.setOtp(passwordEncoder.encode(otp.toString()));
            userRepository.updateProfile(userEntity);
            return "otp sent";
        }
        else {
            return "User not found";
        }
    }
}
