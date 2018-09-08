package random;

public class MyStaticBlock {

    static String str = "";
    static {
        System.out.println("Static block");
        str = "I am a String";
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(str);
    }
}
