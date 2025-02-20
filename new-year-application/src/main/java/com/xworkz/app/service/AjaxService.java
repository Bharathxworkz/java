package com.xworkz.app.service;

public interface AjaxService {
    String checkEmail(String email);
    String checkPhoneNumber(Long phoneNumber);

    String sendOtp(String email);
}
