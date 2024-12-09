package com.xworkz.jopapplication.service;

import com.xworkz.jopapplication.dto.JobDto;

import java.util.List;

public interface JobService {

    boolean validAndSave(JobDto jobDto);

    JobDto getById(int id);

    List<JobDto> getAllUsers();

    JobDto getUserByName(String name);

    JobDto getUserByPhoneNo(String phoneNo);

    boolean deleteUserById(int userid);

    void updateUserById(JobDto jobDto);
}
