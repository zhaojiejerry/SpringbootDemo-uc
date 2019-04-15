package com.example.demo.entity;

public class Application {

	/**
	 * 应用id
	 */
	private Integer id;
	/**
	 *应用名称
	 */
	private String name;
	/**
	 * 应用类型
	 */
	private Integer typeId;
	/**
	 * 
	 * 是否删除
	 */
	private Integer isDeleted;
	
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
