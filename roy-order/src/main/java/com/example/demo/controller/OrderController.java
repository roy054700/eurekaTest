package com.example.demo.controller;

import com.example.common.model.Orders;
import com.example.common.model.User;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    @Autowired
    OrderService orderService;
    @RequestMapping(path = "/findGoods/{id}",method = RequestMethod.GET)
    public Orders findGoods(@PathVariable Integer id){

        User u = new User();
       return orderService.findGoods(id);
    }
}
