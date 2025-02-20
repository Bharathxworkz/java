package com.xworkz.app.service;

import org.springframework.stereotype.Service;

@Service
public interface AjaxService {
    String checkEmail(String email);

    String checkPhoneNumber(long mobile);

    String chekingEmail(String email);
    String sendOtp(String email);
}
