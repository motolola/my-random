package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MyArray {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(myArr()));
		System.out.println(Arrays.toString(myIntArr()));
		System.out.println(Arrays.toString(myIntegerArray()));
		System.out.println(myList());
		System.out.println(myStringList());
		System.out.println(Arrays.toString(efor()));
		System.out.println(randoms());
	}
	
	public static ArrayList<Integer> randoms() {
		Random randon = new Random();
		ArrayList<Integer> myInt = new ArrayList<Integer>();
		myInt.add(randon.nextInt(10));
		myInt.add(randon.nextInt(10));
		myInt.add(randon.nextInt(10));
		myInt.add(randon.nextInt(10));
		
		return myInt;
	}
	
	public static String[] efor() {
		String[] food = {"beans", "rice", "yam", "corn", "coco"};
		
		for (String y : food) {
			System.out.println(y);
		}
		
		return food;
	}
	public static String[] myArr() {
		
		String arr[] = new String[3];
		arr[0] = "Zero";
		arr[1] = "One";
		arr[2] = "Two";
		
		return arr;	
	}
	
	public static int[] myIntArr() {
		int arr[] = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		return arr;
	}
	
	public static Integer[] myIntegerArray() {
		Integer arr[] = new Integer[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		return arr;
	}
	
	public static ArrayList<Integer> myList(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		return arr;	
	}
	public static ArrayList<String> myStringList(){
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Zero");
		arr.add("One");
		arr.add("Two");
		arr.add("Three");
		
		return arr;	
	}

}
