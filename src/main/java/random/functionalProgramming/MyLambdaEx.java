package random.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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
                .reduce(0, Integer::sum);
        System.out.println(mySum);

        numbers.forEach(i -> System.out.println(i+" squared = "+i*i));

        IntStream
               .range(1,20)
               .filter(i -> (i > 3))
                .filter(m -> (m <= 11))
               .filter(p -> (p%2 != 0))
               .forEach(System.out::println);

        System.out.println(IntStream
                .range(1,5)
                .filter(i -> i < 5)
                .sum());

        System.out.println("------ Squares of Ints ------");

        Arrays.stream(new int[] {2,4,5,7,8,9})
                .map(i -> i * i)
                .forEach(System.out::println);

        System.out.println("------ String Array Stream ------");

        Arrays.stream(new String[] {"Apple", "Banana","Orange","Pineapple", "Papaya", "Pear", "Strawberry"})
                .filter(s -> s.startsWith("P"))
                .sorted()
                .forEach(System.out::println);
        System.out.println(sumDigits(4579001));

    }

    public static int sumDigits(int value)
    {
        if(value < 1){
            return 0;
        }
        return value % 10 + sumDigits((value - (value%10))/10);
    }
}
