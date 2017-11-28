package com.esaruhan.spring.thymeleaf.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ertugruls on 8/9/2017.
 */

@ConfigurationProperties(prefix = "app")
@Component
public class ApplicationProperties {

    @Value("${app.port}")
    public Integer port;





}
