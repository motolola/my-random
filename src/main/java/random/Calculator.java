package random;

import java.util.ArrayList;

public class Calculator {
	
	public static void main(String[] args) {
		
		System.out.println(add(2,4));
		System.out.println(factorial(5));
		System.out.println(odd(100));
		System.out.println(prime(1000));
		System.out.println(reverseWord("Hello"));
		System.out.println(reverseSentence("I am a boy from the Hood"));
	}
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int factorial(int number) {
		
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = i * fact;
		}
		return fact;
	}
	
	public static ArrayList<Integer> odd(int oddNumberLessThan) {
		ArrayList<Integer> odds = new ArrayList<>();
		for(int i = 1; i <= oddNumberLessThan; i++) {
			
			if (i % 2 != 0) {
				odds.add(i);
			}
		}
		return odds;
	}
	
	public static ArrayList<Integer> prime(int primeNumberLessThan){
		
		ArrayList<Integer> primes = new ArrayList<>();
		
		for(int p = 2; p <= primeNumberLessThan; p++) {
			int count = 0;
			for(int i=2; i < p; i++) {
				
				if (p%i == 0) {
					count++;
				}
			}
			
			if (count == 0) {
				primes.add(p);
			}	
		}
		return primes;
	}
	
	public static String reverseWord(String word)
	{
		return new StringBuilder(word).reverse().toString();
	}
	
	public static String reverseSentence(String sentence) {
		
		return sentence;
	}

}
