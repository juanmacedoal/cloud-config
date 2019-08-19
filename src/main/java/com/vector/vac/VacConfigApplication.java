package com.vector.vac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Cloud config service
 * 
 * @author Vector ITC Group
 */
@SpringBootApplication
public class VacConfigApplication {
    
    /**
     * Run the cloud configuration service.
     *
     * @param args {@link String}[]
     */
    public static void main(
        final String[] args){
        SpringApplication.run(VacConfigApplication.class, args);
    }
    
}
