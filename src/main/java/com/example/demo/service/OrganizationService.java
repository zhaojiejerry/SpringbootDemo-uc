package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Organization;
import com.example.demo.util.TreeNode;

public interface OrganizationService {

	public List<Organization> getUserOrganization(String userName);
	
	public List<TreeNode> getUserOrganizationTree(String userName);
	
	public List<TreeNode> getAllSubOrganizationTree(Integer id);
}
