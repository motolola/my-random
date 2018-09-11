package random;
/*
  variable arguments in Java.
 */
public class MyVariableArgument {

    public static void main(String[] args)
    {
        System.out.println(mySum(3,4,5,6, 8,9));
    }

    public static int mySum(int... numbers)
    {
        int sum = 0;
        for(int number : numbers)
        {
          sum += number;
        }
        return sum;
    }
}
