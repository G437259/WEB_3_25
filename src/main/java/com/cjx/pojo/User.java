package com.cjx.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String  loginId;
    private String  name;
    private String  phone;
    private String  password;
    private Integer sex;
    private Date birthday;
    private String email;
    private String address;
    private Integer isDel;

}
