package com.java.basic.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterClass {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		DateTimeFormatter ptDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(today.format(ptDateFormat));
			
		// String >> LocalDate
		String ptDateString = "26-01-2021";
		LocalDate theDate = LocalDate.parse(ptDateString, ptDateFormat);
		System.out.println(theDate);
	}
}
