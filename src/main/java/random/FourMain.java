package random;

public class FourMain {

    public static void main(String[] args)
    {
        PlayFourObject four = new PlayFourObject();
        System.out.println("1st line: "+four.getScore());
        four.four();
        System.out.println("2nd line: "+four.getScore());
        four.six();
        System.out.println("3rd line: "+four.getScore());
        four.six();
        System.out.println("4th line: "+four.getScore());
    }
}
