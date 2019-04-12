package com.example.demo.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrganizationDao;
import com.example.demo.entity.Organization;
import com.example.demo.service.OrganizationService;
import com.example.demo.util.TreeBuilder;
import com.example.demo.util.TreeNode;

@Service
public class OrganizatinServiceImpl implements OrganizationService {

	@Autowired
	OrganizationDao organizationDao;

	/**
	 * 用户组织机构信息返回list
	 */
	@Override
	public List<Organization> getUserOrganization(String userName) {
		// TODO Auto-generated method stub
		String levelCode = organizationDao.getUserOrganizationsLevelCode(userName);
		List<String> levalList = new ArrayList<>();
		List<String> pathList = splitStr(levelCode, levalList);
		List<Organization> resultList = organizationDao.getUserOrganizations(pathList);
		return resultList;

	}

	/**
	 * 点截取路径
	 * 
	 * @param leval
	 * @param levalList
	 * @return
	 */
	private static List<String> splitStr(String leval, List<String> levalList) {
		if (leval == null) {
			return null;
		}

		if (leval.contains(".")) {
			String parentLeval = leval.substring(0, leval.lastIndexOf("."));
			levalList.add(parentLeval + ".");
			splitStr(parentLeval, levalList);
		}
		return levalList;
	}

	/**
	 * 返回用户的组织机构信息（树结构）
	 */
	public List<TreeNode> getUserOrganizationTree(String userName) {
		String levelCode = organizationDao.getUserOrganizationsLevelCode(userName);
		List<String> levalList = new ArrayList<>();
		List<String> pathList = splitStr(levelCode, levalList);
		List<Organization> resultList = organizationDao.getUserOrganizations(pathList);
		List<TreeNode> nodeList = new ArrayList<TreeNode>();
		for (Organization organization : resultList) {
			TreeNode node = new TreeNode(String.valueOf(organization.getId()), organization.getName(),
					String.valueOf(organization.getParentId()), organization.getLevelCode(), organization.getTypeId());
			nodeList.add(node);
		}
		List<TreeNode> list = TreeBuilder.bulid(nodeList);
		return list;
	}
	public List<TreeNode> getAllSubOrganizationTree(Integer id) {
		List<Organization> resultList = organizationDao.getAllSuborganizationsById(id);
		List<TreeNode> nodeList = new ArrayList<TreeNode>();
		for (Organization organization : resultList) {
			TreeNode node = new TreeNode(String.valueOf(organization.getId()), organization.getName(),
					String.valueOf(organization.getParentId()), organization.getLevelCode(), organization.getTypeId());
			nodeList.add(node);
		}
		List<TreeNode> list = TreeBuilder.bulid(nodeList);
		return list;
	}
}
