package com.app;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.app.service.CityService;

@EnableCaching
@SpringBootApplication
public class Application implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    //private MusicService musicService;
    private CityService cityService;
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Spring Boot Caffeine Caching Example Configuration");

        Map<String, String> cityMap = cityService.city();        
        System.out.println("List City::"+cityMap.toString());
        
        /*
        Thread.sleep(10000);
        Map<String, String> cityMap2 = cityService.city();        
        System.out.println("List City2::"+cityMap2.toString());
        Thread.sleep(10000);
        Map<String, String> cityMap3 = cityService.city();        
        System.out.println("List City3::"+cityMap3.toString());

        Thread.sleep(10000);
        Map<String, String> cityMap4 = cityService.city();        
        System.out.println("List City4::"+cityMap4.toString());
*/
        
/*        play("trombone");
        play("guitar");
        play("trombone");
        play("bass");
        play("trombone");
*/    
        }

    /*private void play(String instrument){
        log.info("Calling: " + MusicServiceIml.class.getSimpleName() + ".play(\"" + instrument + "\");");
        musicService.play(instrument);
    }*/
    
    /*private void city() {
    	log.info("Calling: " + CityServiceIml.class.getSimpleName() + ".city(\"" + code + "\");");
    	cityService.city(code);
    }*/
}
