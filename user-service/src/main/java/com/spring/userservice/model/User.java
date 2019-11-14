package com.spring.userservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author Administrator
 * @Date 2019/11/6 16:52
 **/
@Data
@ToString
//@EqualsAndHashCode
public class User implements Serializable {

    private int id;
    private String userAccount;
    private String userName;




}
