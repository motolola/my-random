package random;

public class Computer {

    public static void main(String[] args)
    {
        fizzbuzz();
    }

    public static void fizzbuzz()
    {
        for (int i = 0; i < 100; i++){
            if (i % 15 == 0){
                System.out.println("fizzBuzz :"+i);
            }else if (i % 5 == 0){
                System.out.println("Buzz :"+i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz: "+i);
            }
        }

    }
}
