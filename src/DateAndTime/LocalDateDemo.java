package DateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class LocalDateDemo {
	
	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getDayOfWeek());
		
		System.out.println(date.plusDays(3));
		System.out.println(date.minusDays(1));
		
		Date d=Calendar.getInstance().getTime();
		DateFormat dformat=new SimpleDateFormat("yyyy-mm-dd");
		String strDate = dformat.format(d);
		
		System.out.println(strDate);  	
	}
}
