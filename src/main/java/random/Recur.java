package random;

import static org.mockito.Matchers.intThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

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
		
		int[] people = {25, 50, 50, 25};
		System.out.println(Tickets(people));
	}
	/*
	 * The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollars bill. An "Avengers" ticket costs 25 dollars.

Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

Can Vasya sell a ticket to each person and give the change if he initially has no money and sells the tickets strictly in the order people follow in the line?

Return YES, if Vasya can sell a ticket to each person and give the change with the bills he has at hand at that moment. Otherwise return NO.
	Line.Tickets(new int[] {25, 25, 50}) // => YES 
Line.Tickets(new int []{25, 100}) 
         // => NO. Vasya will not have enough money to give change to 100 dollars
	 */
	public static String Tickets(int[] peopleInLine){
		Arrays.sort(peopleInLine);

		int denomination25Count = 0;
		int denomination50Count = 0;
		int denomination100Count = 0;
		
		for (int i = 0; i < peopleInLine.length; i++) {
			if (peopleInLine[i] == 25) {
				denomination25Count++;
			} else if (peopleInLine[i] == 50) {
				denomination50Count++;
			} else if (peopleInLine[i] == 100) {
				denomination100Count++;
			}	
		}
		
		//Deal with 50 first ... 
		//Total Number of 25 MUST equal or greater than 50..
		denomination25Count = denomination25Count - denomination50Count;
		if (denomination25Count < 0) {
			return "NO";
		}
		
		//Deal with 100 now ...
		int denomination25CountAfter50 = denomination25Count - denomination100Count;
		if (denomination25CountAfter50 < 0) {
			return "NO";
		}
		int change100 = denomination100Count * 75;
		//denomination50Count = denomination50Count -
		if (change100 > (denomination25CountAfter50 * 25 + denomination50Count * 50) ) {
			return "NO";
		}

	        return "YES";
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
