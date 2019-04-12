package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.demo.service.OrganizationService;

@RestController
@RequestMapping(value = "/uc/organization")
public class OrganizationController {

	@Autowired
	OrganizationService organizationService;
	
	@GetMapping(value = "getUserOrganizationTree")
	public String getUserOrganizationTree(String userName) {
		String result = JSON.toJSONString(organizationService.getUserOrganizationTree(userName));
		return result;
	}
	@GetMapping(value = "getAllSubOrganizationTree")
	public String getAllSubOrganizationTre(Integer id) {
		String result = JSON.toJSONString(organizationService.getAllSubOrganizationTree(id));
		return result;
	}
}
