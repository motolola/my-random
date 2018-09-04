package random;

import java.util.ArrayList;
import java.util.List;

public class Motolola {

	public static void main(String[] args) {

		List<Integer> myInts = new ArrayList<>();

		for (int i = 1; i <=1000; i++){
		    myInts.add(i);
        }
        System.out.println(myInts.size());
		myInts.forEach(System.out::println);
    }

	public static String main() {
	    return "Soft";
    }

}
