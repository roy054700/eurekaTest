package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Resource
    private UserService UserService;
    @RequestMapping(path = "/one/{id}",method = RequestMethod.GET)
    public User selectUser(@PathVariable Integer id){
          User user = new User();
          user.setId(id);

          new HashMap<>();
        return UserService.selectOne(user);
    }
}
