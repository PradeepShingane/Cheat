import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Menu\n1.Crciket Player Details\n2.Hockey Player Details\nEnter choice");
int choice=Integer.parseInt(br.readLine());
if(choice!=1 && choice !=2)
{
	System.out.println("Invalid Input");
	System.exit(0);
}
System.out.println("Enter player name");
String name=br.readLine();
System.out.println("Enter team name");
String tname=br.readLine();
System.out.println("Enter number of matches played");
int noOfMatches=Integer.parseInt(br.readLine());

switch(choice)
{
	case 1:
		System.out.println("Enter total runs scored");
		int trs=Integer.parseInt(br.readLine());
		System.out.println("Enter total number of wickets taken");
		int wk=Integer.parseInt(br.readLine());
		CricketPlayer c=new CricketPlayer(name, tname, noOfMatches, trs, wk);
		c.displayPlayerStatistics();break;
		
	case 2:
		System.out.println("Enter the position");
		String pos=br.readLine();
		System.out.println("Enter total number of goals taken");
		int goals=Integer.parseInt(br.readLine());
		HockeyPlayer h=new HockeyPlayer(name, tname, noOfMatches, pos, goals);
		h.displayPlayerStatistics();
}
	}

}
