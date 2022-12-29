package basicsofjava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateHour = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(simpleDateHour.format(calendar.getTime()));
		calendar.getTimeZone();
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(calendar.get(Calendar.AM_PM));
		System.out.println(calendar.get(Calendar.MINUTE));
		
		

	}

}
