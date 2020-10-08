package com.util;

public class StringUtilTest {

	public static void main(String[] args) {
		StringUtil util = new StringUtil();
//		util.parse("Case Scheduled for 2020/04/20 at 06:00 AM - 06:30");
		util.parse("Case Appointment set to 2020/04/20 06:00 AM - 06:30");
		util.parse("Appointment Confirmed ( 2020/04/20 06:00 AM - 06:30 )");

	}

}
