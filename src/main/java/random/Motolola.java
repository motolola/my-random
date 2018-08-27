package random;

public class Motolola {

	public static void main(String[] args) {

		Object str = new String("Hello");
        System.out.println(str);
        if (str instanceof Integer){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

	}

}
