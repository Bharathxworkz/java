package com.xworkz.service;

import com.xworkz.dto.NyearDto;
import org.springframework.web.multipart.MultipartFile;

public interface NyearService {




    boolean save(NyearDto dto);

   NyearDto getDtoByEmail(String email,String password);



    void updatePasswordByEmail(String email, String newPassword, String confirmPassword);

    public NyearDto checkEmail(String email);
    NyearDto getById(int id);

    NyearDto updatedatata(NyearDto nyearDto, NyearDto sessionDto, MultipartFile multipartFile);
}
