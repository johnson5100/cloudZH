package com.spring.userservice.controller;

import com.spring.userservice.model.User;
import com.spring.userservice.utils.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

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
    public ResultData<List<User>> getUserList(){
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setUserAccount("admin");
        user.setUserName("管理员");
        userList.add(user);

        User user2 = new User();
        user2.setId(2);
        user2.setUserAccount("user");
        user2.setUserName("普通管理员");
        userList.add(user2);

        User user3 = new User();
        user3.setId(1);
        user3.setUserAccount("admin");
        user3.setUserName("管理员");
        userList.add(user3);

//        userList = userList.stream()
//                .filter(user1 -> user1.getUserName() == "管理员")
//                .distinct()
//                .collect(toList());
//
//        userList.stream().skip(1).forEach(user1 -> {});

        return new ResultData<List<User>>().success(userList);
    }

}
