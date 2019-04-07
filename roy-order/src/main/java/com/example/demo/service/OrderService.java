package com.example.demo.service;


import com.example.common.model.Orders;

public interface OrderService {
	int insert(Orders record);


    Orders findGoods(Integer id);
}
