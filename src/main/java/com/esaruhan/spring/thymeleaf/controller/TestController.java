/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esaruhan.spring.thymeleaf.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ertugruls
 */
@Controller
public class TestController {
    
  
   
    @RequestMapping("/content")
    public String content1() {
        return "Content";
    } 
    
    
    @RequestMapping("/content2")
    public String content2() {
        return "Content2";
    } 
    
     
    @RequestMapping("/content3")
    public String content3() {
        return "Content3";
    } 

}
