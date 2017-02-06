import java.util.GregorianCalendar;


public class UserMainCode {
	public static void displayYear(int a) {
        GregorianCalendar c=new GregorianCalendar();
        boolean b=c.isLeapYear(a);
       if(b)
 
    	   System.out.println(a+" is leap year");
    	   else
    		   System.out.println(a+" is not leap year");
}
}

