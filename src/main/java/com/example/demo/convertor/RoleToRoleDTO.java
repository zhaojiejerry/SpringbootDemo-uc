package com.example.demo.convertor;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.example.demo.dto.RoleDTO;
import com.example.demo.entity.Role;

public class RoleToRoleDTO {
	public static RoleDTO convert(Role role) {
		RoleDTO roleDTO = new RoleDTO();
		roleDTO = RoleMapper.INSTANCE.roleToroleDTO(role);
		return roleDTO;
	}

	public static List<RoleDTO> convert(List<Role> roleList) {
		return roleList.stream().map(e -> convert(e)).collect(Collectors.toList());
	}
}
