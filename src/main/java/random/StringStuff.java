package random;

public class StringStuff {
	
	public static void main(String[] args) {
		
		long before = System.currentTimeMillis();
		
		StringBuilder stringBuilder = new StringBuilder("Akin");

		System.out.println(stringBuilder);

		System.out.println(stringBuilder.append("Jide"));
		
		long after = System.currentTimeMillis();

		System.out.println(after - before);
        System.out.println("----");
        System.out.println(stringBuilder);
        System.out.println("----");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println("----");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.substring(2, 4);
        System.out.println(stringBuilder);
        stringBuilder.replace(2,3," baba ");
        System.out.println(stringBuilder);

    }

}
