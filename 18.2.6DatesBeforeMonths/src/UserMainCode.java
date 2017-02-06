import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode 
{
	public static void displayDay(String date) throws Exception
	{
		Date d;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		d=sdf.parse(date);
		Calendar cal1=Calendar.getInstance();
		
		cal1.setTime(d);
		
		cal1.add(Calendar.MONTH,-20);
		

		String y1=sdf.format(cal1.getTime());
		
		System.out.println("20 months before "+date+" will be "+y1);
	} }

