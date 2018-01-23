package random;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStuff {

	public static void main(String[] args) {
		System.out.println(curentDate());
		System.out.println(new Date());
	}
	
	public static String curentDate() {
		DateFormat dateFormat = new SimpleDateFormat("D-M-Y hh:mm:ss");
		String myDate = dateFormat.format(new Date());
		return myDate;
	}

}
