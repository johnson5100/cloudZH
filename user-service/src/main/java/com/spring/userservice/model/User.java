package com.spring.userservice.model;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName User
 * @Description TODO
 * @Author Administrator
 * @Date 2019/11/6 16:52
 **/
@Data
@ToString
public class User {

    private int id;
    private String userAccount;
    private String userName;
}
