package random;


public class Dashize {

	public static void main(String[] args) {
		System.out.println(dashatize(1288432070));

	}
	/*
	 * Given a number, return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark.

        dashatize(274) -> '2-7-4'
        dashatize(6815) -> '68-1-5'
	 */
	public static String dashatize(int num) {
		String myStr = "";
		
		while (num > 0) {
		    int modulo = ( num % 10);
		    if (modulo % 2 != 0) {
		    	myStr = myStr.concat("-"+ modulo+"-");
		    } else {
		    	myStr = myStr.concat(String.valueOf(modulo));
		    }
		    num = num / 10;
		}
		
		StringBuilder sb = new StringBuilder(myStr);
		myStr = sb.reverse().toString().replace("--", "-");

		if (myStr.startsWith("-")) {
			myStr = myStr.substring(1, myStr.length()-1);
		}

		if (myStr.endsWith("-")) {
			myStr = myStr.substring(0, myStr.length()-1);
		}
		
		return myStr.trim();
    }

}
