package com.xworkz.jopapplication.service;

import com.xworkz.jopapplication.dao.JobDao;
import com.xworkz.jopapplication.dao.JobDaoImpl;
import com.xworkz.jopapplication.dto.JobDto;

import java.util.Collections;
import java.util.List;

public class JobServiceImpl implements JobService{

    boolean isNameValidated = false;
    boolean isExperienceValidated = false;
    boolean isPositionValidated = false;
    boolean added = false;

    JobDao jobDao = new JobDaoImpl();

    @Override
    public boolean validAndSave(JobDto jobDto) {

        if(jobDto!=null){
            if(jobDto.getName()!=null && !jobDto.getName().isEmpty()){
                System.out.println("Name validated");
                added = jobDao.validAndSave(jobDto);
                isNameValidated = true;
            }
            /*if(jobDto.getExperience()!=null && !jobDto.getExperience().isEmpty()){
                System.out.println("Experience validated");
                isExperienceValidated = true;
            }
            if(jobDto.getPosition()!=null && !jobDto.getPosition().isEmpty()){
                System.out.println("position validated");
                isPositionValidated = true;
            }*/
        }
        if(isExperienceValidated==true){
            System.out.println("Fields are validated");
            added = jobDao.validAndSave(jobDto);
            return added;
        }
        return added;
    }

    @Override
    public JobDto getById(int id) {

        return jobDao.getById(id);
    }

    @Override
    public List<JobDto> getAllUsers() {
        return jobDao.getAllUsers();
    }

    @Override
    public JobDto getUserByName(String name) {

        return jobDao.getUserByName(name);
    }

    @Override
    public JobDto getUserByPhoneNo(String phoneNo) {

        return jobDao.getUserByPhoneNo(phoneNo);
    }

    @Override
    public boolean deleteUserById(int userid) {

        return jobDao.deleteUserById(userid);

    }

    @Override
    public void updateUserById(JobDto jobdto) {

        jobDao.updateUserById(jobdto);
    }
}
