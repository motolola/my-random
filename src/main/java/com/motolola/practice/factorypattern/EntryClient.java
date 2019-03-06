package com.motolola.practice.factorypattern;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class EntryClient
{
    public static void main(String[] args)
    {

        Human man = HumanFactory.getHuman("man");
        Human woman = HumanFactory.getHuman("woman");

        man.gender();
        woman.gender();
    }
}
