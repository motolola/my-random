package random;

public class StringStuff {
	
	public static void main(String[] args) {
		
		//System.out.println("I am here ....");
		long before = System.currentTimeMillis();
		
		//StringBuffer stringBuffer = new StringBuffer("klm");
		//stringBuffer.length();
		//System.out.println(stringBuffer.charAt(1));
		//for (int i = 1; i <= 1000; i++) {
			//System.out.println(i);
		//}
		StringBuilder stringBuilder = new StringBuilder("Jide");
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.append(" Agboola"));
		
		long after = System.currentTimeMillis();
		System.out.println(after - before);
		//System.
		
	}

}
