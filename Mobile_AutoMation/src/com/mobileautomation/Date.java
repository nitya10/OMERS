package com.mobileautomation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Date {
public void date(){
	DateFormat df=new SimpleDateFormat();
	Date d=new Date();
	df.format(d);
	System.out.println(d);
}
}
