package random;



public class SmallestIntergerFinder {

	public static void main(String[] args) {
		int[] myArr = {10, -20, -3, 7, 9};
		System.out.println(findSmallestInt(myArr));
	}
	 public static int findSmallestInt(int[] args) { 
		 java.util.Arrays.sort(args);
		 return args[0];
	    }
}
