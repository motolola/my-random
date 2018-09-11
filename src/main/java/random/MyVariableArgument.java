package random;

import java.util.ArrayList;
import java.util.List;

/*
  variable arguments in Java.
 */
public class MyVariableArgument {

    public static void main(String[] args)
    {
        System.out.println(mySum(3,4,5,6, 8,9));
        for (Human myHuman : myHumans()){
            System.out.println(myHuman.toString());
        }
        //variableHuman(myHumans());
    }

    public static int mySum(int... numbers)
    {
        int sum = 0;
        for(int number : numbers)
        {
          sum += number;
        }
        return sum;
    }

    public static void variableHuman(Human... humans)
    {
        for(Human myHum : humans){
            System.out.println("Human being: "+myHum.toString());
        }
    }

    public static ArrayList<Human> myHumans()
    {
        ArrayList<Human> humanList = new ArrayList();

        humanList.add(new Human(1,"Baba", 32));
        humanList.add(new Human(2, "Suwe", 43));
        humanList.add(new Human(3, "Olowo", 56));

        return humanList;
    }
}
class Human {
    private int id;
    private String name;
    private int age;

    public Human(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
