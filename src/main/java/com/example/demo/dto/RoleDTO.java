package com.example.demo.dto;

import java.math.BigDecimal;


/**
 * 
     * Demo 角色传输对象
     * 
     * @author 李兆杰
     * @date 2019/04/10
 */
public class RoleDTO {
	/**
             * 角色名称
     */
	private String roleName;
	/**
	 * 角色id
	 */
	private Integer id;
	/**
	 * 角色组Id
	 */
	private Integer roleGroupId;
	
    
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
