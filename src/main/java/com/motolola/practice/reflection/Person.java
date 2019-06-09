package com.motolola.practice.reflection;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class Person
{
    private final Integer age;
    private final String name;
    private final String country;

    public Person(final Integer age, final String name, final String country) {
        this.age = age;
        this.name = name;
        this.country = country;
    }

    public String shout()
    {
        System.out.println("I am shouting");
        return "Shout";
    }

    public String walk()
    {
        System.out.println("I am shouwalkingting");
        return "Walk";
    }

    private String shit()
    {
        System.out.println("I am sjitting");
        return "shit";
    }
}
