package random;

public class StringStuff {
	
	public static void main(String[] args) {
		
		long before = System.currentTimeMillis();
		
		StringBuilder stringBuilder = new StringBuilder("Jide");
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.append(" Agboola"));
		
		long after = System.currentTimeMillis();
		System.out.println(after - before);
				
	}

}
