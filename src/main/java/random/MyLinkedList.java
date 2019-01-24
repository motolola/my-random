package random;

import java.util.*;
import java.util.stream.Stream;

public class MyLinkedList {

	public static void main(String[] args) {
    System.out.println("I am here");
    tryLink();
    tryArrayList();
    tryHashSet();
    tryHashMap();
	}
	public static void tryLink() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Ade");
		System.out.println(linkedList);
		linkedList.add("Kola");
		System.out.println(linkedList);
		linkedList.add("Jide");
		System.out.println(linkedList);
		linkedList.add("Solo");
		System.out.println(linkedList);
		linkedList.add("Tunde");
		System.out.println(linkedList);
		linkedList.addFirst("Bola");
		System.out.println(linkedList);
		linkedList.add(3, "Akin");
		System.out.println(linkedList);
		System.out.println(linkedList.contains("Akin"));
	}
	
	public static void tryArrayList() {
		ArrayList<String> myArrayList = new ArrayList<>();
		myArrayList.add("John");
		System.out.println(myArrayList);
		myArrayList.add("Michael");
		System.out.println(myArrayList);
		myArrayList.add("Sean");
		System.out.println(myArrayList);
		myArrayList.add(2, "Pete");
		System.out.println(myArrayList);
		myArrayList.remove(3);
		System.out.println(myArrayList);
		System.out.println(myArrayList.contains("Pete"));
	}

	public static void tryHashSet()
    {
        Set mySet = new HashSet();
        mySet.add(new String("boy"));
        mySet.add(new String("girl"));
        mySet.add(new String("man"));
        mySet.add(new String("woman"));

        System.out.println(mySet);
        System.out.println(mySet.size());
        System.out.println(mySet);

        System.out.println("+++++++++++++++++++");
        System.out.println("+++++++++++++++++++");

        Iterator<String> it = mySet.iterator();
        while (it.hasNext()){
            String obj = it.next();
            System.out.println(obj);
        }

    }

    public static void tryHashMap()
    {
        Map myMap = new HashMap();

        myMap.put(1, "Woman");
        myMap.put(2, "Lady");
        myMap.put(3, "Queen");

        System.out.println(" +++++++++++++++++++ ");
        System.out.println(" +++++++++++++++++++ ");
        System.out.println(" +++ HASHMAP +++ ");
        System.out.println(myMap);

        myMap.replace(2, "Mama");

        System.out.println(myMap);
    }

}
