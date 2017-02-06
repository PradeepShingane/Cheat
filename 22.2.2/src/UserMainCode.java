import java.util.StringTokenizer;

public class UserMainCode {
public static void display(String a)
{
	
	StringTokenizer d=new StringTokenizer(a,"!");
	
	while (d.hasMoreTokens()) 
	{
	System.out.print(d.nextElement());
    }
	
	
}
}