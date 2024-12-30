package com.xworkz.app.dao;

import com.xworkz.app.dto.UserDto;

public interface UserDao {

    boolean save(UserDto userDto);

    String getEmailById(int id);

    Object[] getNameAndEmailById(int id);

    Object[] getNameandAgeBYAdhar(long adharNo);

    boolean updateNameByAdharNo(String userName, long adharNo);

    boolean deleteById(int id);

    boolean updareNmaeByid(String userName,int id);


    String getNameBYId(int id);

    String getAddressById(int id);

    Object[] getAdharNoandNameById(int id);
}
