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
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    MailService mailService;

    @Override
    public String checkEmail(String email) {
        boolean exists = userRepository.checkEmail(email);
        if (exists) {
            return "Email Exist";
        }
        return "Email does not Exist";
    }

    @Override
    public String checkPhoneNumber(long mobile) {
        boolean exists = userRepository.checkPhoneNumber(mobile);
        if (exists){
            return "PhoneNumber Exist";
        }
        return "PhoneNumber does not exist";
}

    @Override
    public String chekingEmail(String email) {
        boolean exists = userRepository.checkEmail(email);
        if (exists) {
            return "";
        }
        return "Email does not Exist";

    }
    @Override
    public String sendOtp(String email) {
        UserEntity mediSaleEntity = userRepository.getDtoByEmail(email);
        System.err.println(mediSaleEntity);
        if (mediSaleEntity.getEmail()!=null){
            Random random = new Random();
            Integer otp = random.nextInt(999999);
            log.info("Your Otp is {} ", otp);
            mailService.sendRegistrationMessage("OTP verification"," your otp is :: "+otp,email);
            mediSaleEntity.setOtp(passwordEncoder.encode(otp.toString()));
            userRepository.updateProfile(mediSaleEntity);
            return "otp sent";
        }
        else {
            return "User not found";
        }
    }

}
