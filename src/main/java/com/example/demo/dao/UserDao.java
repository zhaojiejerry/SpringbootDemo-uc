package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.User;

/**
 * 
     * Demo 数据访问层
     * 
     * @author 李兆杰
     * @date 2019/04/08
 */
public interface UserDao {
    /**
                  * 查询一个用户信息
     * @return
     */
	public User getUser();
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> listUsers();
	/**
	 * 添加一个用户
	 * @return 
	 */
	public int addUser();
	/**
	 * 更新用户信息
	 * @return
	 */
	public int updateUser(User user);
	
	/**
	 * 查询用户包含角色信息
	 */
	List<User> queryForList();
}
