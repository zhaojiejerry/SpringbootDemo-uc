package com.example.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * 
     * Demo class
     * 
     * @author 李兆杰
     * @date 2019/04/08
 */
@RunWith(SpringRunner.class)

@SpringBootTest
public class UcDemoApplicationTest {

	@Test
	public void contextLoads() {
	}
	@Before
    public void init() {
        System.out.println("开始测试-----------------");
    }
 
    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }
}
