import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class UserMainCode
{


public static void displayDate(int year, int month, int day) throws ParseException 
       {
              String s = year + "-" + month + "-" + day;
              SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
              Date date = sdf1.parse(s);
              
              Calendar cal1 = Calendar.getInstance();
              Calendar cal2 = Calendar.getInstance();
              
              cal1.setTime(date);
              cal2.setTime(date); 
cal1.add(Calendar.WEEK_OF_MONTH, -1);
              
              cal1.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
              cal2.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
              
              System.out.println("Next Friday: "+sdf1.format(cal2.getTime()));
              System.out.println("Previous Friday: "+sdf1.format(cal1.getTime()));
       } 

}
