package Assignments;

import java.util.Date;

public class DateTimeProgram {

	public static void main(String[] args) {
		Date d1=new Date();
       System.out.println(d1.getTime());
       Date d2=new Date(d1.getTime()+(1000*60*60*24*30l));//future time
     //  Date d2=new Date(d1.getTime()-(1000*60*60*24*30l));//past time
       System.out.println(d2);
       String format1=d2.toString();
      String date=  format1.substring(8,10);
      String month=format1.substring(4,7);
      String year=format1.substring(format1.length()-4);
      String hour=format1.substring(11,14);
      String minute=format1.substring(14,17);
      String second=format1.substring(17,19);
       String format2= date.concat(month).concat(year);
      System.out.println(format2);
      String format3=(date+" ".concat(month)+" ".concat(year)+" ".concat(hour).concat(minute).concat(second));
      System.out.println(format3);
	}

}
