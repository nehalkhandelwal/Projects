package com.mobiquity.model;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.inject.Named;

/**
 * Created by nehalkhandelwal on 10/03/16.
 */
@Configuration
public class ApplicationConfig {

    @Named
    static class JerseyConfig extends ResourceConfig {
        public JerseyConfig(){
            this.packages("com.mobiquity");
        }
    }

    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate  = new RestTemplate();
        return restTemplate;
    }
}
