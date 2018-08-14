package com.motolola.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/")
    public String home(){
        return "I am a boy iof great learning ability";
    }

    @RequestMapping("/quote")
    public String quote(){
            return restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api", String.class);
    }
}
