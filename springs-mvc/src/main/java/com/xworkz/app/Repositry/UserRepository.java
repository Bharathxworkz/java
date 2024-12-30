package com.xworkz.app.Repositry;

import com.xworkz.app.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    boolean validateAndSave(UserDto dto);

    List<UserDto> getallUser();

    void deleteUserById(int id);

    UserDto getUserById(int id);

    void updateUser(UserDto userDto);
}
