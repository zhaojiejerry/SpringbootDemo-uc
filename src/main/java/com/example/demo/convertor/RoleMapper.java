package com.example.demo.convertor;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.RoleDTO;
import com.example.demo.entity.Role;


@Mapper
public interface RoleMapper {
  RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);
  @Mapping(source = "name", target = "roleName")
  RoleDTO roleToroleDTO(Role role);
}
