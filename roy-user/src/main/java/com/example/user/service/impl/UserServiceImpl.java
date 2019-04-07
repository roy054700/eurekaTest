package com.example.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.user.dao.TUserMapper;
import com.example.user.entity.User;
import com.example.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl extends ServiceImpl<TUserMapper,User> implements UserService {

    @Resource
    private TUserMapper tstudentMapper;
    @Override
    public User selectOne(User user) {
        return tstudentMapper.selectOne(user);
    }
}
