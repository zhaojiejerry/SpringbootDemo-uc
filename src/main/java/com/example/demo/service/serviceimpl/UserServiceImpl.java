package com.example.demo.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * 
     * Demo 业务逻辑层实现类
     * 
     * @author 李兆杰
     * @date 2019/04/08
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	@Override
	public User login() {
		// TODO Auto-generated method stub
		return userDao.getUser();
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.listUsers();
	}

	@Override
	public int addUser() {
		// TODO Auto-generated method stub
		return userDao.addUser();
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	@Override
	public List<User> getAllUserAndRole() {
		// TODO Auto-generated method stub
		List<User> users = userDao.queryForList();
		return users;	
	}
}
