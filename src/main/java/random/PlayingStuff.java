package random;

public class PlayingStuff {

    public static void main(String[] args)
    {
        int myInt = (int) (Math.random() * 7 + 1); //Dice
        //(int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound);

        switch (myInt) {
        case 2:
            System.out.println("This is 2");
            break;
        case 3:
            System.out.println("This is 3");
            break;
        default:
            System.out.println("I don't know this number ...");
    }
        System.out.println(myInt);
    }
}
