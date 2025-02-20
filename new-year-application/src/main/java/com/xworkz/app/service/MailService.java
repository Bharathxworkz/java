package com.xworkz.app.service;

public interface MailService {
    boolean sendRegistrationMessage(String subject,String body,String email);
}
