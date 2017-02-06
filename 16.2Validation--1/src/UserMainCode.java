import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UserMainCode {
public static boolean validateDate(String s)
{
	int c=0;
	String[] a=s.split("-");
			for(int i=0;i<s.length();i++)
			{
			if(s.charAt(i)=='-')
			{
				c++;
			}
			}
			//System.out.println(c);
			if(c!=2)
				return false;
			else 
			{
				int day=Integer.parseInt(a[0]);
				int month=Integer.parseInt(a[1]);
				if(day<=31 && month <=12)
					return true;
				else
					return false;
}
}
}

