package com.bitcamp.web.controller;

import com.bitcamp.web.common.util.Printer;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller//클래스를 빈으로 등록  -  클래스만 빈으로 등록 가능  
public class  HomeController{
     @Autowired CustomerService customerService;
     @Autowired Printer p;


    @RequestMapping("/") // 빈아님
    public String name() {
          System.out.println("루트 URL경로로 들어옴 ");
        // int count = customerService.countAll();
          //p.accept("o"+count);
        // System.out.println(" 고객의 수  "+count);
          return "index";
     }




}