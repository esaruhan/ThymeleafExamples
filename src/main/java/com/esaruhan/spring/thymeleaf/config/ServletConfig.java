package com.esaruhan.spring.thymeleaf.config;

import com.esaruhan.spring.thymeleaf.utils.ApplicationProperties;
import nz.net.ultraq.thymeleaf.LayoutDialect;
import nz.net.ultraq.thymeleaf.decorators.strategies.GroupingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * Created by ertugruls on 8/8/2017.
 * 
 * http://zetcode.com/articles/springbootthymeleafconf/
 * 
 */
@Component
public class ServletConfig {

    

    @Autowired
    ApplicationProperties properties;

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {

        
        return (container -> {
            container.setPort(properties.port);
        });
    }

   
   

}
