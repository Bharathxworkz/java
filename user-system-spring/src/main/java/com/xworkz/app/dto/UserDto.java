package com.xworkz.app.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "user_tabla")
@NamedQueries({
 @NamedQuery(name = "getEmailById",query = "Select user.Email from UserDto user where user.id= :id"),
@NamedQuery(name = "getNameAndEmailById",query = "Select user.Email, user.userName from UserDto user where user.id = :id"),
@NamedQuery(name = "getNameandAgeBYAdhar",query = "Select user.userName,user.Age from UserDto user where user.AdharNo= :i"),
@NamedQuery(name = "update" , query = "update UserDto user set user.userName=:name where user.AdharNo=:adha"),
@NamedQuery(name = "delete",query = "delete from UserDto user where user.id=:id"),
@NamedQuery(name = "updareNmaeByid" , query ="update UserDto user set user.userName=:name where user.id=:id"),
@NamedQuery(name = "getNameBYId",query = "select  user.userName from UserDto user where user.id=:id"),
@NamedQuery(name = "getAddressById",query = "select user.Address from UserDto user where user.id=:id"),
@NamedQuery(name = "getAdharNoandNameById",query = "select user.AdharNo ,user.userName from UserDto user where user.id =:id")})

public class UserDto {
    @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
  @Column(name = "id")
    private  int id;
   @Column(name = "userName")
    private String userName;
    @Column(name = "Age")
    private  int Age;
   @Column(name = "Email")
    private String Email;
   @Column(name = "phNo")
    private  int phNo;
    @Column(name = "AdharNo")
    private  long AdharNo;
    @Column(name = "Address")
    private  String Address;
   ;
}
