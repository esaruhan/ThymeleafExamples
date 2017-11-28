package com.esaruhan.spring.thymeleaf.utils;

/**
 * Created by ertugruls on 8/6/2017.
 */
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;

@SuppressWarnings("unchecked")
public class ApplicationContextUtils   {



    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextUtils.applicationContext = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz){

        return applicationContext.getBean(clazz);
    }

    public static <T> T getBean(Class<T> clazz, String beanName){

        return (T) applicationContext.getBean(beanName);
    }

    public static void listBeans(){

        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            try {

                System.out.printf("Bean -> [name: %s] [type: %s]", beanName, ApplicationContextUtils.getApplicationContext().getBean(beanName).getClass().getName());
            } catch (Exception e) {
                //yut
            }

        }
    }

}
