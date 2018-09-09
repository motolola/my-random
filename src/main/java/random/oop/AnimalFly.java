package random.oop;

public class AnimalFly implements Flyable {

    @Override
    public void lift() {
        System.out.println("Lifting");
    }

    @Override
    public void forwardRun() {
        System.out.println("Forward run");
    }

    @Override
    public void gliding() {
        System.out.println("Gliding");
    }

    @Override
    public void landing() {
        System.out.println("Landing");
    }
}
