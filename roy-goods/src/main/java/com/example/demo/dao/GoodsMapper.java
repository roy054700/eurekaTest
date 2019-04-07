package com.example.demo.dao;

import java.util.List;

import com.example.common.model.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {
    int insert(Goods record);

	int insertSelective(Goods record);

    List<Goods> selectList(Integer id);
}