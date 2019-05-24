package com.app.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"city"})
public class CityServiceIml implements CityService {

    private static Logger log = LoggerFactory.getLogger(CityServiceIml.class);

    @Cacheable
    public Map<String,String> city() {
    	Map<String, String> cityMap = new HashMap<String,String>();
    	cityMap.put("HYD", "Hyderabad");
    	cityMap.put("DEL", "DELHI");
    	cityMap.put("MUM", "MUMBAI");
    	cityMap.put("KOL", "KOLKATA");
    	cityMap.put("BAN", "BANGLORE");
    	
        log.info("Executing: " + this.getClass().getSimpleName() );
        return cityMap;
    }

}
