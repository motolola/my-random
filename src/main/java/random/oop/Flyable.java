package random.oop;

public interface Flyable {

    public void lift();
    public void forwardRun();
    public void gliding();
    public void landing();

    default void justTesting()
    {
        System.out.println("I am from flyable Interface");
    }

}
