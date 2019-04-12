package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Organization;

/**
 * 
 * Demo 组织机构数据访问层
 * 
 * @author 李兆杰
 * @date 2019/04/10
 */
public interface OrganizationDao {
	/**
	 * 根据用户名获取用户所在机构的level_code
	 * 
	 * @param userName
	 * @return
	 */
	public String getUserOrganizationsLevelCode(String userName);

	/**
	 * 根据level_code获取机构信息
	 * 
	 * @param pathList
	 * @return
	 */
	public List<Organization> getUserOrganizations(@Param("pathList") List<String> pathList);

	/**
	 * 根据机构id获取所有层级子机构
	 * 
	 * @param id
	 * @return
	 */
	public List<Organization> getAllSuborganizationsById(Integer id);
}
