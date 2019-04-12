package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.UcDemoApplicationTest;
import com.example.demo.entity.Organization;
import com.example.demo.util.TreeNode;

public class OrganizationTest extends UcDemoApplicationTest {
	
	private static Map<String, Object> inparam = new HashMap<String, Object>();
	
	@Autowired
	OrganizationService organizationService;
	
	@Before
	public void readyData() {
		inparam.put("name","jerry");

	}
	
	@Test
	public void findUserOrganizations() {
		List<Organization> organizations = organizationService.getUserOrganization((String)inparam.get("name"));
		Organization organization = organizations.get(0);
		String result = organization.getName();
		Assert.assertEquals("中瑞公司", result);
	}
	
	@Test
	public void findUserOrganizationsTree() {
		List<TreeNode> organizationsTree = organizationService.getUserOrganizationTree((String)inparam.get("name"));
		TreeNode organization = organizationsTree.get(0);
		String result = organization.getName();
		Assert.assertEquals("中瑞公司", result);
	}
}
