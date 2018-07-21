package com.sdyin.serviceribbon.controller;

import com.sdyin.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuye
 * @Date: 2018/7/21 17:04
 */
@RestController
public class HelloControler {

  @Autowired
  HelloService helloService;

  @GetMapping(value="/hi")
  public String hi(@RequestParam String name){
    return helloService.hiService(name);
  }

}
