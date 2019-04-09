package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

/**
 *
     * Demo 业务逻辑层接口
     * 
     * @author 李兆杰
     * @date 2019/04/08
 */
public interface UserService {
    /**
          * 用户登录
     * @return
     */
	public User login();
	/**
	  * 获取所有用户
	 * @return
	 */
	public List<User> getAllUser();
	/**
	 * 添加用户
	 * @return
	 */
	public int addUser();
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
}
