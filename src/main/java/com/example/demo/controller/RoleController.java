package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RoleDTO;
import com.example.demo.service.RoleService;

@RestController
@RequestMapping("/uc/roles")
public class RoleController {

	@Autowired
	RoleService roleService;
	@RequestMapping(value = "listRoles")
	public List<RoleDTO> getRoleList(){
		return roleService.getRoleList();
		
	}
}
