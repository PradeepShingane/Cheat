import java.time.temporal.ValueRange;
import java.util.Scanner;


public class Main {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String a =s.nextLine();
	UserMainCode.validateCode(a);
	if(UserMainCode.validateCode(a))
	{
		System.out.println("Valid");
	}
	else
		System.out.println("Invalid");
}
}
