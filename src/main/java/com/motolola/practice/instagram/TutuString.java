package com.motolola.practice.instagram;
/*
* What is the output?
* a) "I Am A Boy"
* b) "I am a boy"
* c) "i am a boy"
* d) toUpperCase
*/

public class TutuString {

    public static void main(String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder("I am a boy");
        StringBuffer stringBuffer = new StringBuffer("I am a girl");

        String strbf = stringBuffer.toString();

        String str =  stringBuilder.toString();

        System.out.println(str);
        System.out.println(strbf);
    }

}
