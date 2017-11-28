package com.esaruhan.spring.thymeleaf.config;

import com.esaruhan.spring.thymeleaf.utils.ApplicationContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ertugruls on 8/1/2017.
 */


@Configuration
public class AppConfig {

    @Autowired
    public void context(ApplicationContext context) {

        ApplicationContextUtils.setApplicationContext(context);
    }
    
    
    
}