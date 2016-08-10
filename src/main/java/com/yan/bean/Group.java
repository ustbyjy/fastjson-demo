/**
 * 
 */
package com.yan.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: GroupBean
 * @author Yanjingyang
 * @date 2016年8月10日 下午3:10:01
 * @version 1.0
 */
public class Group {
	private int id;
	private String name;
	private List<User> list = new ArrayList<User>();

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

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", list=" + list + "]";
	}

}
