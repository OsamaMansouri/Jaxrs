package com.example.Jaxrs.config;

import com.example.Jaxrs.controller.CompteJaxrsApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteJaxrsApi.class);
        return jerseyServlet;
    }
}