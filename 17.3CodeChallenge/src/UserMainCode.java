
public class UserMainCode {
public static boolean validateCode(String a)
{
	String b=a.substring(a.length()-2);
	int c=Integer.parseInt(b);
	 if((a.startsWith("*") && c/100==0))
	 {
		 return true;
	 }
	 else
		 {
		 return false;
		 }
}
}
