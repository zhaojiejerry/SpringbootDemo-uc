package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.entity.Application;
import com.example.demo.service.ApplicationService;

@RestController
@RequestMapping(value = "/uc/application")
public class ApplicationController {

	
	@Autowired
	ApplicationService appService;
	
	@GetMapping(value="getAppByDynamicQuery")
	public List<Application> getAppByDynamicQuery(String inputJson){
		@SuppressWarnings("unchecked")
		Map<String,Object> inparam = JSON.parseObject(inputJson, Map.class);
		return appService.getApplicationsBydynamicQuery(inparam);
	}
	
	@PostMapping(value="DynamicUpdate")
	public String DynamicUpdateApp(String inputJson){
		@SuppressWarnings("unchecked")
		Map<String,Object> inparam = JSON.parseObject(inputJson, Map.class);
		int result = appService.dynamicUpdate(inparam);
		if (result > 0) {
			return "更新成功";
		}
		else {
		    return "更新失败";
		}
	}
	@PostMapping(value ="DeleteBatch")
	public String deleteBatch(String  ids) {
		Map<String, Object> inparam = JSON.parseObject(ids,Map.class);
		String _ids = (String) inparam.get("ids");
		String[] arr = _ids.split(",");
		List<String> idList = Arrays.asList(arr);
		int result = appService.batchUpdateApplications(idList);
		if (result > 0) {
			return "删除成功";
		}
		else {
		    return "删除失败";
		}
		
	}
}
