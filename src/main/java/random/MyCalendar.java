package random;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.PM));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

	}

}
