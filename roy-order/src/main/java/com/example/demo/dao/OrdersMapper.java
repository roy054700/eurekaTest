package com.example.demo.dao;

import com.example.common.model.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper {
    int insert(Orders record);

    int insertSelective(Orders record);

    Orders findById(Integer id);
}