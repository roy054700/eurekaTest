package com.example.user.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.user.dao.TUserMapper;
import com.example.user.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    User selectOne(User user);
}
