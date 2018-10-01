package random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Jide");
        students.put(2, "Atilola");
        students.put(3, "Abisola");
        students.put(4, "Kemi");

        System.out.println(students);

        List<Integer> myInts = new ArrayList<>();
        myInts.add(23);
        myInts.add(40);

        System.out.println(myInts);

    }
}
