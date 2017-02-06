import java.util.StringTokenizer;

public class UserMainCode {
public static void display(String a)
{
	
	StringTokenizer d=new StringTokenizer(a," ");
	
	while (d.hasMoreTokens()) 
	{
	System.out.println(d.nextElement());
    }
	
	StringTokenizer st=new StringTokenizer(a);
	String sReversed = "";
	while (st.hasMoreTokens()) {		
	            sReversed = st.nextToken() + " " + sReversed;
	}
	System.out.println(sReversed); 
}
}