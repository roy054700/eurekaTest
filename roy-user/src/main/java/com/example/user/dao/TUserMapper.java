package com.example.user.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUserMapper extends BaseMapper<User> {
}
