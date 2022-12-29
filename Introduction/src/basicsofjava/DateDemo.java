package basicsofjava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat simpleDateHour = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		simpleDate.format(date);
		System.out.println(simpleDate.format(date));
		System.out.println(simpleDateHour.format(date));

	}

}
