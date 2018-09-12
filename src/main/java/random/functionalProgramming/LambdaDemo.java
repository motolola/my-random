package random.functionalProgramming;

interface Boyish {
    void talk();
}

//class Boy implements Boyish {
//
//    public void talk(){
//        System.out.println("I am talking");
//    }
//}

public class LambdaDemo {

    public static void main(String[] args)
    {
        Boyish boyi =  () ->
            System.out.println("I am talking!");
        boyi.talk();
    }
}
