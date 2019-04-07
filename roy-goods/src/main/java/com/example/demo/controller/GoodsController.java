package com.example.demo.controller;

import com.example.common.model.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(path = "/findGoods/{id}",method = RequestMethod.GET)
    public List findGoods(@PathVariable Integer id){
        System.out.println("远程调用8082=="+id);

        List<Goods> list = goodsService.selectList(id);
        return list;

    }
    @RequestMapping(path = "/add",method = RequestMethod.POST)
    public Integer inset(@RequestBody Goods goods){
        Integer i = goodsService.insert(goods);
       return i;
    }


    @RequestMapping(path = "/add1",method = RequestMethod.POST)
    public Integer inset1( Goods goods){
        Integer i = goodsService.insert(goods);
        System.out.println("进入====insert1"+goods);
        return i;
    }

    @RequestMapping(path = "/add2",method = RequestMethod.POST)
    public Integer inset2( int age){
        System.out.println("进入=====insert2="+age);
        return 2;
    }
}
