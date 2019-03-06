package com.motolola.practice.autowire;

import org.springframework.stereotype.Service;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
@Service("doganimal")
public class DogAnimal implements Animal
{
    @Override
    public String makeSound()
    {
        return "Woof";
    }

    @Override
    public String move()
    {
        return "dog move";
    }

    @Override
    public String getName()
    {
        return "I am dog";
    }
}
