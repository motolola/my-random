package random;

public class StringToCharJava {

    public static void main(String[] args)
    {
        String str = "Journalist";
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }
        
        System.out.println("++++++++++++++++++");
        System.out.println("++++++++++++++++++");

        for(char myChar : chars){
            System.out.println(myChar);
        }
    }
}
