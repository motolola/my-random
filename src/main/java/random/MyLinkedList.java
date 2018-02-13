package random;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
    System.out.println("I am here");
    tryLink();
    tryArrayList();
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

}
