package com.purpose.financial.compositeservice.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.Years;

public class Utils {
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	private Utils() {
		// To be used as a static utilities class
	}

	// Gives Current Time in UTC
	public static Date getCurrentTimeUtc() {
		return new LocalDateTime(DateTimeZone.UTC).toDate();
	}
	
	public static Date convertToUtc(Date nonUtcTime) {
		DateTime utcTime = new DateTime(nonUtcTime);
		return utcTime.withZone(DateTimeZone.UTC).toDate();
	}
	
	public static Date addDays(Date date, int daysToAdd) {
		LocalDateTime lDate = new LocalDateTime(date);
		return lDate.plusDays(daysToAdd).toDate();
	}
	
	public static Integer getCurrentAgeInYears(Date from) {
		DateTime now = DateTime.now(DateTimeZone.UTC);
		DateTime fromDate = new DateTime(from);
		
		if(now.isBefore(fromDate)) {
			return 0;
		}
		
		Years age = Years.yearsBetween(fromDate, now);
		
		return age.getYears();
	}
	
	public static Date addHours(Date date, int hoursToAdd) {
		LocalDateTime lDate = new LocalDateTime(date);
		
		return lDate.plusHours(hoursToAdd).toDate();
	}
	
	public static Date addMinutes(Date date, int minutesToAdd) {
		LocalDateTime lDate = new LocalDateTime(date);
		
		return lDate.plusMinutes(minutesToAdd).toDate();
	}
	
	public static Date convertToDateTime(String dateStr) {
		
		if(StringUtils.isEmpty(dateStr)) {
			return null;
		}
		
		SimpleDateFormat format  = new SimpleDateFormat(DATE_TIME_FORMAT);
		Date date = null;
		
		try {
			date = format.parse(dateStr);
		}catch(ParseException ex) {
			// Just return null.
		}
		
		return date;
	}
	
	public static Boolean isNullOrNegative(Integer number) {
		return ((number == null) || (number < 0));
	}
	
	public static Boolean isNotNullAndPositive(Integer number){
	    return ((number != null) && (number > 0));
	}
	
	public static Boolean isAnyNullOrNegative(Integer ... numbers) {
		
		for(Integer n: numbers) {
			if(isNullOrNegative(n)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static Boolean isListNullOrEmpty(List<?> list) {
		return ((list == null) || (list.isEmpty()));
	}

}