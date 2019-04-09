package com.example.demo.entity;
import java.io.Serializable;

import lombok.Data;
/**
 * 
     * Demo 用户实体类
     * 
     * @author 李兆杰
     * @date 2019/04/08
 */
@Data
public class User implements Serializable {
    /**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;
	/**
          *姓名
     */
	private String name;
	/**
	 *id
	 */
	private Integer id;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 地址
	 */
	private String address;
	/**
	 *联系方式
	 */
	private String phone;
	/**
	 *公司机构
	 */
	private String company;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
