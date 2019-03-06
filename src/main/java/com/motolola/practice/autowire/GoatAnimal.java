package com.motolola.practice.autowire;

import org.springframework.stereotype.Service;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
@Service
public class GoatAnimal implements Animal
{
    @Override
    public String makeSound() {
        return "ba ba ba ba!";
    }

    @Override
    public String move() {
        return "goat move";
    }

    @Override
    public String getName() {
        return "goat";
    }
}
