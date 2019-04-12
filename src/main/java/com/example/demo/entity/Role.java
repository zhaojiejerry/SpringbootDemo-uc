package com.example.demo.entity;

/**
 * 
 * @author 李兆杰
 *
 */
public class Role {
    /**
     * 角色名称
     */
	private String name;
	/**
	 * 角色id
	 */
	private Integer id;
	/**
	 * 角色组Id
	 */
	private Integer roleGroupId;
	/**
	 * 用户id
	 */
	private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoleGroupId() {
		return roleGroupId;
	}
	public void setRoleGroupId(Integer roleGroupId) {
		this.roleGroupId = roleGroupId;
	}
	
	
}
