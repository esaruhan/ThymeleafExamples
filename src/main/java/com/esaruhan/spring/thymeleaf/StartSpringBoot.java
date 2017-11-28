/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esaruhan.spring.thymeleaf;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 * @author ertugruls
 */

@EnableRabbit
@ComponentScan(basePackages = {"com.esaruhan.spring"})
@IntegrationComponentScan
@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
public class StartSpringBoot {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartSpringBoot.class, args);
        
    }







}
