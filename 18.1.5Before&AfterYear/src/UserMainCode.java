import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


public class UserMainCode 
{
	public static void displayDateDetails(String date) throws Exception
	{
		Date d;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		d=sdf.parse(date);
		LocalDate yr=LocalDate.parse(date);
		LocalDate yl=yr.plusYears(1);
		LocalDate yb=yr.plusYears(-1);
		System.out.println(yl+"\n"+yb);
	} }