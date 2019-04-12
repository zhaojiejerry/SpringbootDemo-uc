package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * 
     * Demo 控制层
     * 
     * @author 李兆杰
     * @date 2019/04/08
 */
@RestController
@RequestMapping("/uc/user")
public class UserController {

	@Autowired
	UserService userService;
	@GetMapping("/allUsers")
	public List<User> listUsers(){
		return userService.getAllUser();
	}
	@GetMapping("/allUsersAndRoles")
	public List<User> listUsersAndRoles(){
		return userService.getAllUserAndRole();
	}
}
