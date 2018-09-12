package random.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class MyLambdaEx {

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7);

        int sum = numbers.stream()
                .filter(number -> (number % 2 != 0))
                .filter(num -> (num < 7))
                .reduce(0,Integer::sum);
        System.out.println(sum);

        int mySum = numbers.stream()
                .filter(num -> (num >= 5))
                //map((n) -> n-2)
                .reduce(0, Integer::sum);
        System.out.println(mySum);

        numbers.forEach(i -> System.out.println(i+" squared = "+i*i));
    }
}
