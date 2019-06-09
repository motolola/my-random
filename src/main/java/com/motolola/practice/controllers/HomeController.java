package com.motolola.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController
{

    @Autowired private RestTemplate restTemplate;

    @GetMapping(value = "/")
    public String home()
    {
        final int val1 = 23;
        final int val2 = 12;
        final int sum = val1 + val2;
        return "The sum is " + sum;
    }

    @GetMapping("/quote")
    public String quote()
    {
            return this.restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api", String.class);
    }
}
