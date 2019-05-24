package com.app.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.CityService;

@RestController
public class AppController {
	
	 private static Logger log = LoggerFactory.getLogger(AppController.class);
	
	@Autowired
	CityService cityService;
	
	@GetMapping("/cities")
	public Map<String, String> getCities() {
		Map<String, String> cityMap = cityService.city();  
		log.info("From Rest API CityMap:"+cityMap);
		return cityMap;
	}
	
}
