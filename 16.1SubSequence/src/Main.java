import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter team name");
		String n=s.nextLine();
		System.out.println("Enter starting index of the sequence");
		int a=s.nextInt();
		System.out.println("Enter ending index of the sequence");
		int b=s.nextInt();
		System.out.println(n.subSequence(a,b));
	}
}