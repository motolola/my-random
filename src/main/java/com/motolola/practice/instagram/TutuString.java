package com.motolola.practice.instagram;
/*
* What is the output?
* a) "I Am A Boy"
* b) "I am a boy"
* c) "i am a boy"
* d) toUpperCase
*/

public class TutuString {

    public static void main(final String[] args)
    {
        final StringBuilder stringBuilder = new StringBuilder("I am a boy");
        final StringBuffer stringBuffer = new StringBuffer("I am a girl");

        final String strbf = stringBuffer.toString();

        final String str =  stringBuilder.toString();

        System.out.println(str);
        System.out.println(strbf);

        System.out.println(myStr("I am here here"));
    }

    public static String myStr(final String str)
    {
        return str;
    }

}
