package com.yan.bean;

/**
 * @Description: UserBean
 * @author Yanjingyang
 * @date 2016年8月10日 下午3:08:51
 * @version 1.0
 */
public class User {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

}
