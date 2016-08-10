/**
 * 
 */
package com.yan.bean;

/**
 * @Description: WeiboBean
 * @author Yanjingyang
 * @date 2016年8月10日 下午3:11:23
 * @version 1.0
 */
public class Weibo {
	private String id;
	private String city;

	public Weibo() {

	}

	public Weibo(String id, String city) {
		super();
		this.id = id;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Weibo [id=" + id + ", city=" + city + "]";
	}

}
