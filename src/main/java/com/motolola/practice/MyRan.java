package com.motolola.practice;

/**
 * Account rebase stuff
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class MyRan
{
    public static void main(String[] args)
    {
        //17 - 26 ... July 2019
        Double[] bal = {
               317.95, 645.26, 600.26, 599.47, 580.82
        };

        for (Double myBal : bal)
        {
            double res = myBal + 2865.54;
            System.out.println(myBal + " ==> " + res );
        }
    }
}
