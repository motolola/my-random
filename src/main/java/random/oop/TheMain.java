package random.oop;

public class TheMain {

    public static void main(String[] args) {

        AnimalFly fly = new AnimalFly();

        fly.forwardRun();
        fly.gliding();
        fly.landing();
        fly.justTesting(); //Uses the default method from the interface.
        Flyable bird = new AnimalFly();
        bird.forwardRun();
        bird.justTesting();
        bird.landing();

    }
}