/**
 * 
 */
package com.yan.bean;

/**
 * @Description: TODO
 * @author Yanjingyang
 * @date 2016年8月11日 上午9:43:11
 * @version 1.0
 */
public class Product {
	private int id;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + "]";
	}

}
