package random;

public class Recur {

	public static void main(String[] args) {
      System.out.println(fact(5));
	}
	
	public static int fact(int num) {
		 return (num == 0) ? 1 : num * fact(num -1);
	}

}
