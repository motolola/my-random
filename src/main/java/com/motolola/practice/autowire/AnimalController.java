package com.motolola.practice.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 * This is to establish that Spring automatically
 * generate a bean of implementor when an interface is autowired.
 */
@RestController
public class AnimalController
{
    @Autowired
    @Qualifier("goatanimal")
    private Animal animal;

    @GetMapping("/name")
    public String getName()
    {
        return this.animal.getName();
    }
    @GetMapping("/sound")
    public String getSound()
    {
        return this.animal.makeSound();
    }
    @GetMapping("/move")
    public String move()
    {
        return this.animal.move();
    }
}
