package random;

public class PennyCalculation {

    public static void main(String[] args)
    {
        int penny = 1;
        for(int i = 1; i <= 30; i++){
            penny = penny * 2;
            System.out.println("Day "+i+": "+penny);
        }
        int result = penny/100; //Pence to Pounds
        System.out.println(result);
    }
}
