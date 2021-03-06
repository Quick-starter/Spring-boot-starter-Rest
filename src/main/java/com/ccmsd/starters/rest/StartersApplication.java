package com.ccmsd.starters.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * SpringBoot entry point application
 *
 * @author Fabio Carvalho (facarvalho@paypal.com or fabiocarvalho777@gmail.com)
 */
@SpringBootApplication
public class StartersApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StartersApplication.class, args);
    }

}
