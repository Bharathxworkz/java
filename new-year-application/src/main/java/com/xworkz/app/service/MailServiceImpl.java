package com.xworkz.app.service;

import com.xworkz.app.constants.ServiceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService{

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public boolean sendRegistrationMessage(String subject, String body, String email) {
        MimeMessagePreparator preparator = mimeMessage->{
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
            messageHelper.setFrom(ServiceConstant.FROM_EMAIL.getPath(),ServiceConstant.FROM_NAME.getPath());
            messageHelper.addTo(email);
            messageHelper.setSubject(subject);
            messageHelper.setText(body);
        };
        javaMailSender.send(preparator);

        return true;
    }
}
