import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode 
{
	public static void displayTime(String date) throws Exception
	{
		Date d;
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		d=sdf.parse(date);
		Calendar cal1=Calendar.getInstance();
		cal1.setTime(d);
		cal1.add(Calendar.HOUR_OF_DAY,2);
		//cal2.add(Calendar.DATE,10);
		//LocalDate yr=LocalDate.parse(d.toString());
		//LocalDate yl=yr.plusYears(2);
		//SimpleDateFormat sd=new SimpleDateFormat("EEEE");
		String y1=sdf.format(cal1.getTime());
	//	String y2=sdf.format(cal2.getTime());
		//LocalDate yb=yr.plusYears(-2);
		//String y2=sd.format(yb);
		System.out.println(y1);
	} }

