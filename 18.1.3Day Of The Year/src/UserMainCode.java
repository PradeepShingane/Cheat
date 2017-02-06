 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
public class UserMainCode {
	
	public static void displayDay(String a) throws Exception
	{
		Date d;
		SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
		d=sd1.parse(a);
		SimpleDateFormat sd=new SimpleDateFormat("D");
System.out.println("Day of year : "+sd.format(d));
}
} 
