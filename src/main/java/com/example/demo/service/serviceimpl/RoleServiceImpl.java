package com.example.demo.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.convertor.RoleToRoleDTO;
import com.example.demo.dao.RoleDao;
import com.example.demo.dto.RoleDTO;
import com.example.demo.entity.Role;
import com.example.demo.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleDao roleDao;
	@Override
	public List<RoleDTO> getRoleList() {
		// TODO Auto-generated method stub
		List<RoleDTO> roleDTOs = new ArrayList<>();
		List<Role> roles = new ArrayList<>();
		roles = roleDao.getRoles();
		roleDTOs = RoleToRoleDTO.convert(roles);
		return roleDTOs;
	}

}
