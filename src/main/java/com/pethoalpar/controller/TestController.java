package com.pethoalpar.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test/{name}")
    @ResponseBody
    public String getHello(@PathVariable("name") String name){
        return "Hello "+name;
    }
}
