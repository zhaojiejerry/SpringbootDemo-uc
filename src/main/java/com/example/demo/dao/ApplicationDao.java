package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Application;

public interface ApplicationDao {

	public List<Application> getApplicationsBydynamicQuery(Map<String,Object> map);
	
	public int dynamicUpdate(Map<String,Object> map);
	
	public List<Application> batchDeleteApplicatons(@Param("list") List<String> list);
	
	public int batchUpdateApplications(@Param("list") List<String> ids);
}
