package random;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Recur {
	
	static int count = 0;

	public static void main(String[] args) {
      System.out.println(fact(5));
		System.out.println(persistence(25));
      try {
		tri(40);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		System.out.println(rowSumOddNumbers(4));
	}
	/*
	 * This supposed to produced sum of rows in an Odd number tree such as 
	 *                            1
	 *                           3 5
	 *                          7 9 11
	 *                         13 15 17 19
	 *                        21 23 25 27 29
	 *                       31 33 35 37 39 41 .
	 *                      ....................
	 *                      similar solution is n * n * n, where n is the nth row.
	 */
	public static int rowSumOddNumbers(int n) {
        int firstOnRow = 1;
        int toAdd = 0;
        for (int i = 1; i <= n; i++){
           firstOnRow = firstOnRow + toAdd;
           toAdd = toAdd + 2;
        }
        
        int sum = firstOnRow;
        int nextOdd = firstOnRow + 2;
        
        for (int j = 1; j < n; j++) {
        	sum = sum + nextOdd;
        	nextOdd = nextOdd + 2;

        }
        return sum;
    }
	
	public static int fact(int num) {
		 return (num == 0) ? 1 : num * fact(num -1);
	}
	
	public static String tri(int maxNumb) throws InterruptedException {
		
		System.out.println("");
		if (maxNumb == 1) {
			return 1+"-";
		}
		for (int i = 1; i < maxNumb; i++) {
			System.out.print(i+"-");
			//Thread.sleep(1000);
			
		}
		TimeUnit.SECONDS.sleep(1);
		return tri(maxNumb - 1);
	}
	
		public static int persistence(long n) {
			int length = String.valueOf(n).length();
			if (length == 1 ) {
				return 0;
			}
			count++;
			String[] digits = Integer.toString((int) n).split("");
			String arr = Arrays.toString(digits);
			int res = 1;
			for (int i = 0; i < length; i++) {
				res = res * Integer.valueOf(digits[i]);
			}
			
			//return length;
			int counting = length * persistence(res);
			return count;
		}
	

}
