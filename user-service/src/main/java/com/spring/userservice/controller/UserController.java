package com.spring.userservice.controller;

import com.spring.userservice.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Administrator
 * @Date 2019/11/6 16:49
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "getUserList")
    public Object getUserList(){
        User user = new User();
        user.setId(1);
        user.setUserAccount("admin");
        user.setUserName("管理员");
        return user;
    }

}
