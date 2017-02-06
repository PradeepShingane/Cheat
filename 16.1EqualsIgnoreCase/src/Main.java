import java.util.*;
public class Main {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter team1");
	String a=s.nextLine();
	System.out.println("Enter team2");
	String b=s.nextLine();
	if(a.equalsIgnoreCase(b))
		System.out.println("Both the venues are same.");
	else
		System.out.println("Both the venues are different.");
}
}
