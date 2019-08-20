package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Cloud config service
 * 
 */
@SpringBootApplication
public class CloudConfigApplication {
    
    /**
     * Run the cloud configuration service.
     *
     * @param args {@link String}[]
     */
    public static void main(
        final String[] args){
        SpringApplication.run(CloudConfigApplication.class, args);
    }
    
}
