package random;

import java.util.Arrays;

public class MyTest {

    public static void main(String[] args)
    {
        System.out.println("This is working");

        Arrays.stream(new String[]{"jide", "Mother", "Gentle"})
                .map(t -> t+"_hello")
                .sorted()
                .forEach(System.out::println);
    }
}
