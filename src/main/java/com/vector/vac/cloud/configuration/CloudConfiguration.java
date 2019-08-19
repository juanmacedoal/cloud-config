package com.vector.vac.cloud.configuration;

import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * Hystrix configurations to handle errors using circuit breaker pattern.
 * 
 * @author Vector ITC Group
 *
 */
@Configuration
@EnableConfigServer
public class CloudConfiguration {
    
}
