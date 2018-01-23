package random;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(myArr()));
	
	}
	
	public static String[] myArr() {
		
		String arr[] = new String[2];
		arr[0] = "Zero";
		arr[1] = "One";
		
		return arr;	
	}

}
