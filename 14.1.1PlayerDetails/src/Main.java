import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the player name");
	String	name=s.nextLine();
	System.out.println("Enter the country name");
	String	country=s.nextLine();
	System.out.println("Enter the skill");
	String	skill=s.nextLine();
	Player p=new Player(name,country,skill);
	PlayerBO p1=new PlayerBO();
	p1.displayPlayerDetails(p);
	
}
}
