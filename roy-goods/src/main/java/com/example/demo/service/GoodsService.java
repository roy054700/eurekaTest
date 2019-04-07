package com.example.demo.service;

import com.example.common.model.Goods;

import java.util.List;


public interface GoodsService {

    Integer insert(Goods record);
	 List<Goods> selectList(Integer id);
}
