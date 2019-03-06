package com.motolola.practice.factorypattern;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class HumanFactory {

    public static Human getHuman(String str)
    {
        if (str.equalsIgnoreCase("woman"))
        {
            return new Woman();
        } else if (str.equalsIgnoreCase("man"))
        {
            return new Man();
        }
        else return null;
    }
}
