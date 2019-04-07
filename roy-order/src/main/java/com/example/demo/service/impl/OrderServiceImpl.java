package com.example.demo.service.impl;

import com.example.common.model.Goods;
import com.example.common.model.Orders;
import com.example.demo.dao.OrdersMapper;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	public OrdersMapper ordersMapper;
    @Autowired
    public RestTemplate restTemplate;

    public static String url = "http://ROY-GOODS/";

	@Override
	public int insert(Orders record) {
		return ordersMapper.insert(record);
	}

    @Override
    public Orders findGoods(Integer id) {


	    //查询用户
        Orders orders =ordersMapper.findById(id);
        List<Goods> list=restTemplate.getForObject(url+"goods/findGoods/"+id,List.class);
        Goods goods = new Goods();
        goods.setCodeId("roy");
        goods.setName("roy");
        goods.setState(44l);
        goods.setStock(444);
        ResponseEntity<Integer> responseEntityesponseEntity = restTemplate.postForEntity(url+"goods/add",goods,int.class);
        System.out.println( responseEntityesponseEntity.getBody());
        orders.setGoodsList(list);
        return orders;
    }

}
