import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
                
                public static void displayDateDetails(String a,String b) throws Exception {
                                
                                
                               
                                SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd");
                                Date dt= sd.parse(a);
                                String[] j=dt.toString().split("-");
                                int y1=Integer.parseInt(j[0]);
                                int m1=Integer.parseInt(j[1]);
                                int d1=Integer.parseInt(j[2]);
                                
                                
                                Date dt1= sd.parse(b);
                                String[] k=( dt1.toString()).split("-");
                                int y2=Integer.parseInt(k[0]);
                                int m2=Integer.parseInt(k[1]);
                                int d2=Integer.parseInt(k[2]);
                                       
                        int y=Math.abs(y2-y1);
                        int m=Math.abs(m2-m1);
                        int d=(Math.abs(d2-d1)-1);
                        
                        System.out.println("Difference between "+a+" and "+b+": "+y+" Years and "+m+" Months");
                }

}

