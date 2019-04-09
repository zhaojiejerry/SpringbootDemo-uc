package com.example.demo.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.User;

/**
 * 
     * Demo service层单元测试
     * 
     * @author 李兆杰
     * @date 2019/04/09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	 @Autowired
	 UserService userService;
	
	 @Test
	 public void findAllUsers() throws Exception {
	      List<User> userList = userService.getAllUser();
	      Assert.assertNotEquals(0,userList.size());
	 }
}
