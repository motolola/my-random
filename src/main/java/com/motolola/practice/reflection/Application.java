package com.motolola.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Just some reflection stuff.
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class Application
{
    public static void main(final String[] args)
    {
        final Person per = new Person(34, "baba", "Niger");

        System.out.println(per.getClass());
        final Class cls = per.getClass();
        final Method[] methods = cls.getDeclaredMethods();
        final Field[] fields = cls.getDeclaredFields();

        for (final Method met: methods)
        {
            System.out.println(met.getName());
        }

        for (final Field fil : fields)
        {
            System.out.println(fil);
        }
    }
}
