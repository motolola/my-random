package random;

public class MyExceptionHandling {

    public static void main(String[] args)
    {
        try {
            method1();
            int i = 1;
            //i = i/0;
        } catch (Exception e) {
            System.out.println("Hello Catch!");
        } finally {
            System.out.println("This is finally");
        }
        method3(5,8);
    }

    public static void method1()
    {
        method2();
    }
    public static void method2()
    {
        System.out.println("I am method 2");
    }
    public static void method3(int a, int b)
    {
        if (b > a){
            throw new RuntimeException("B is greater than A");
        }
        System.out.println(a-b);
    }
}
