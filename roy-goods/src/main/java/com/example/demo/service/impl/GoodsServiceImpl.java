package com.example.demo.service.impl;

import java.util.List;

import com.example.common.model.Goods;
import com.example.demo.dao.GoodsMapper;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	public GoodsMapper goodsMapper;


    @Override
    public Integer insert(Goods record) {
        // TODO Auto-generated method stub
        return goodsMapper.insert(record);
    }

    @Override
    public List<Goods> selectList(Integer id) {
        // TODO Auto-generated method stub
        return goodsMapper.selectList(id);
    }
}
