package com.motolola.practice;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class MyRan
{
    public static void main(String[] args)
    {
        //17 - 26 ... July 2019
        Double balance[] = {
               317.95, 645.26, 600.26, 599.47, 580.82
        };

        for (int i = 0; i < balance.length; i ++)
        {
            double res = balance[i] + 2865.54;
            System.out.println(balance[i] + " ==> " + res );
        }
    }



}
