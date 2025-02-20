package com.xworkz.service;

import com.xworkz.repository.NyearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AjaxServiceImpl implements AjaxService{
    @Autowired
    private NyearRepository nyearRepository;
    @Override
    public String checkEmail(String email) {
        boolean exists = nyearRepository.checkEmail(email);
        if (exists){
            return "Email Exists";
        }
        return "Email does not exist";
    }

    @Override
    public String checkPhNo(Long contact) {
        boolean exists = nyearRepository.checkPhNo(contact);
        if (exists){
            return "contact already Exists";
        }
        return "contact doesnot exist";
    }
}
