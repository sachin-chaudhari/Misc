package com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	
	private Pattern p1 = Pattern.compile("Case\\s+Scheduled\\s+for\\s+([^\\s]+)\\s+at\\s+(.*?)$");
	private Pattern p2 = Pattern.compile("Case\\s+Appointment\\s+set\\s+to\\s+([^\\s]+)\\s+(.*?)$");
	private Pattern p3 = Pattern.compile("Appointment\\s+Confirmed\\s+\\(([^)]+)\\).*?$");
	
	public void parse(String toBeParsed) {
		 Matcher m1 = p1.matcher(toBeParsed);
		 Matcher m2 = p2.matcher(toBeParsed);
		 Matcher m3 = p3.matcher(toBeParsed);
		 if(m1.find()) {
			 System.out.println(m1.group(1));
			 System.out.println(m1.group(2));
		 } else if(m2.find()) {
			 System.out.println(m2.group(1));
			 System.out.println(m2.group(2));
		 } else if(m3.find()) {
			 System.out.println(m3.group(1));
		 }
	}

}
