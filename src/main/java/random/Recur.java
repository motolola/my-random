package random;

import java.util.concurrent.TimeUnit;

public class Recur {

	public static void main(String[] args) {
      //System.out.println(fact(5));
      try {
		tri(40);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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

}
