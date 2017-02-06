
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UserMainCode {
public static void displayDate(String a)
{
	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	System.out.println(sdf.format(new Date(a)));
}
}
