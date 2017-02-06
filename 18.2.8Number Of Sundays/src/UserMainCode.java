import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode 
{
	public static void displayDay(String a,String b) throws Exception
	{
		Date d1,d2;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		d1=sdf.parse(a);
		d2=sdf.parse(b);
		Calendar cal1=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();
		cal1.setTime(d1);
		cal2.setTime(d2);
	    int w1 = cal1.get(Calendar.DAY_OF_WEEK);
	    cal1.add(Calendar.DAY_OF_WEEK, -w1 + 1);

	  
	    int w2 = cal2.get(Calendar.DAY_OF_WEEK);
	    cal2.add(Calendar.DAY_OF_WEEK, -w2 + 1);

	    //end Saturday to start Saturday 
	    long days = (cal2.getTimeInMillis()-cal1.getTimeInMillis())/(1000*60*60*24);
	    long daysWithoutSunday = days-(days*6/7);
	    System.out.println(daysWithoutSunday);
	} }


