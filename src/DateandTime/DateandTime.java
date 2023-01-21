package DateandTime;

import java.time.LocalDate;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateandTime {
	public static void main(String[] args) {
		Date d = new Date();
	 System.out.println(d);
	
	 LocalDate date =  LocalDate.now();
	 System.out.println(date);
	 
	 date = date.plusDays(3);
	 System.out.println(date);
	  
	 date = date.plusMonths(2);
	 System.out.println(date);
	 
	 boolean leapYear =LocalDate.parse("2022-12-12").isLeapYear();
	 System.out.println(leapYear);
	 
	
}}
