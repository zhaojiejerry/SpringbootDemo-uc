package com.example.demo.service.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ApplicationDao;
import com.example.demo.entity.Application;
import com.example.demo.service.ApplicationService;
@Service
public class ApplicationServiceImpl implements ApplicationService{

	@Autowired
	ApplicationDao applicationDao;
	@Override
	public List<Application> getApplicationsBydynamicQuery(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return applicationDao.getApplicationsBydynamicQuery(map);
	}
	@Override
	public int dynamicUpdate(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return applicationDao.dynamicUpdate(map);
	}
	@Override
	public List<Application> batchDeleteApplicatons(List<Integer> ids) {
		return  applicationDao.batchDeleteApplicatons(ids);	
	}
	@Override
	public int batchUpdateApplications(List<Integer> ids) {
		// TODO Auto-generated method stub
		return applicationDao.batchUpdateApplications(ids);
	}

}
