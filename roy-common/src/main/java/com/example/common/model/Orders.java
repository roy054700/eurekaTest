package com.example.common.model;

import java.io.Serializable;
import java.util.List;

public class Orders implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer goodsId;

    private Integer quantity;

    private Long state;

    private List<Goods> goodsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", quantity=" + quantity +
                ", state=" + state +
                ", goodsList=" + goodsList +
                '}';
    }
}