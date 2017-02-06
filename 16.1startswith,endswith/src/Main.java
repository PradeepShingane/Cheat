import java.util.Scanner;


public class Main {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of players");
	int n=s.nextInt();
	s.nextLine();
	System.out.println("Enter the player name");
	String na[]=new String[n];
	for(int i=0;i<n;i++)
	{
		na[i]=s.nextLine();
	}
	System.out.println("Player name starting with 'M' or Ending with 'a'");
	for(int i=0;i<n;i++)
	{
	if(na[i].startsWith("M")||na[i].endsWith("a"))
	{
		System.out.println(na[i]);
	}
	
}
}
}
