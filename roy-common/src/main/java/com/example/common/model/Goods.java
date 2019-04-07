package com.example.common.model;

import java.io.Serializable;

public class Goods implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String codeId;

	private String name;

	private Integer stock;

	private Long state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Long getState() {
		return state;
	}

	public void setState(Long state) {
		this.state = state;
	}

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", codeId='" + codeId + '\'' +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", state=" + state +
                '}';
    }
}

	