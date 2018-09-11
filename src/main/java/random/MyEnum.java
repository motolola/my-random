package random;


public class MyEnum {

    enum days {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String [] args)
    {
        days[] arr = days.values();

        System.out.println(arr.length);
        for (days myDay : arr){
            System.out.println("Day is "+myDay);
        }
    }
}
