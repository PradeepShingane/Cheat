import java.util.Scanner;
import java.io.*;

public class Main {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Player name");
	String a=s.nextLine();
	System.out.println("Enter starting index");
	int n=s.nextInt();
	System.out.println("Short name of "+a+": "+a.substring(n));
}
}
