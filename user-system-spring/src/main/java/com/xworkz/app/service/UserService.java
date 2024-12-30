package com.xworkz.app.service;

import com.xworkz.app.dto.UserDto;

public interface UserService {


    boolean validateAndSave(UserDto userDto);
    String getEmailById(int id);
    public Object[] getNameAndEmailById(int id);
    public  Object[] getNameandAgeBYAdhar(long AdharNo);
    boolean updateNameByAdharNo(String userName,long AdharNo);
    boolean deleteById(int id);
    boolean updareNmaeByid(String userNAme,int id);
    String getNameBYId(int id);
    String getAddressById(int id);
    public Object [] getAdharNoandNameById(int id);
   /* void UpdateUser(UserDto userDto);
    boolean deleteUserById(int id);
    UserDto getUserbyId(int id);
    UserDto getUserName(String userName);*/
}
