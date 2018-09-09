package random.oop;

public class TheMain {

    public static void main(String [] args)
    {
        AnimalFly fly = new AnimalFly();
        fly.forwardRun();
        fly.lift();
        fly.justTesting();// Uses the default method from the interface.
    }
}
