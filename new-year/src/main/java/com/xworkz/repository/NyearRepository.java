package com.xworkz.repository;

import com.xworkz.dto.NyearDto;
import com.xworkz.entity.NyearEntity;

import java.util.List;

public interface NyearRepository {
    boolean save(NyearEntity entity);
    public  boolean checkEmail(String email);
    public  boolean checkPhNo(Long contact);

   NyearEntity  getDtoByEmail(String email);
    NyearEntity  getEmail(String email);

    void updatePasswordByEmail(String email, String newPassword,String confirmPassword);
    public NyearEntity getById(int id);

    NyearEntity updatedatata(NyearEntity nyearEntity);


}
