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
		Calendar cal2=Calendar.getInstance();
		cal1.setTime(d);
		cal2.setTime(d);
		cal1.add(Calendar.DATE,-10);
		cal2.add(Calendar.DATE,10);
		//LocalDate yr=LocalDate.parse(d.toString());
		//LocalDate yl=yr.plusYears(2);
		SimpleDateFormat sd=new SimpleDateFormat("EEEE");
		String y1=sdf.format(cal1.getTime());
		String y2=sdf.format(cal2.getTime());
		//LocalDate yb=yr.plusYears(-2);
		//String y2=sd.format(yb);
		System.out.println(y1+"\n"+sd.format(cal1.getTime())+"\n"+y2+"\n"+sd.format(cal2.getTime()));
	} }

