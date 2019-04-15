package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.entity.Application;

public interface ApplicationService {

	public List<Application> getApplicationsBydynamicQuery(Map<String,Object> map);
	
	public int dynamicUpdate(Map<String,Object> map);
	
	public List<Application> batchDeleteApplicatons(List<String> ids);
	
	public int batchUpdateApplications(List<String> ids);
}
