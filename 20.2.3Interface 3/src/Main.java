
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 boolean a=true;
	while(a)	
	 {
	 System.out.println("Menu\n1.Bowler\n2.Batsman\n3.WicketKeeper\n4.AllRounder\nEnter your choice");
	 
	    int choice=Integer.parseInt(br.readLine());
	    switch(choice)
	    {
	    case 1:
	    	System.out.println("Enter the Bowler details\nEnter player name");
	    	String name=br.readLine();
	    	System.out.println("Enter team name");
	    	String teamname=br.readLine();
	    	System.out.println("Enter number of matches played");
	    	int noOfMatches=Integer.parseInt(br.readLine());
	    	System.out.println("Enter number of wickets taken");
	    	int noOfWickets=Integer.parseInt(br.readLine());
	    	Bowler bowl=new Bowler(name, teamname, noOfMatches, noOfWickets);
	    	bowl.displayPlayerStatistics();
	    	System.out.println("Do you want to continue?");
	    	String cont=br.readLine();
	    	if(cont.equalsIgnoreCase("YES"))
	    	{
	    	 a=true;
	    	}
	    	else
	    	{
	    		a=false;
	    	}
	    		break;
	    case 2:
	    	System.out.println("Enter the Batsman details\nEnter player name");
	    	String name1=br.readLine();
	    	System.out.println("Enter team name");
	    	String teamname1=br.readLine();
	    	System.out.println("Enter number of matches played");
	    	int noOfMatches1=Integer.parseInt(br.readLine());
	    	System.out.println("Enter the runs scored");
	    	int runs=Integer.parseInt(br.readLine());
	    	Batsman bat=new Batsman(name1, teamname1,noOfMatches1,runs);
	    	bat.displayPlayerStatistics();
	    	System.out.println("Do you want to continue?");
	    	String cont1=br.readLine();
	    	if(cont1.equalsIgnoreCase("YES"))
	    	{
	    	a=true;
	    	}
	    	else
	    	{
	    		a=false;
	    	}
	    		break;
	    	
	    case 3:
	    	System.out.println("Enter the WicketKeeper details\nEnter player name");
	    	String name11=br.readLine();
	    	System.out.println("Enter team name");
	    	String teamname11=br.readLine();
	    	System.out.println("Enter number of matches played");
	    	int noOfMatches11=Integer.parseInt(br.readLine());
	    	System.out.println("Enter number of catches taken");
	    	int noOfCatches=Integer.parseInt(br.readLine());
	    	System.out.println("Enter number of stumpings");
	    	int stump=Integer.parseInt(br.readLine());
	    	System.out.println("Enter number of dismissals");
	    	int dis=Integer.parseInt(br.readLine());
	    	System.out.println("Enter the runs scored");
	    	int runs1=Integer.parseInt(br.readLine());
	    	WicketKeeper wk=new WicketKeeper(name11, teamname11, noOfMatches11, noOfCatches, stump, dis, runs1);
	    	wk.displayPlayerStatistics();
	    	System.out.println("Do you want to continue?");
	    	String cont11=br.readLine();
	    	if(cont11.equalsIgnoreCase("YES"))
	    	{
	    	 a=true;
	    	}
	    	else
	    	{
	    		a=false;
	    	}
	    		break;
	    	
	    case 4:
	    	System.out.println("Enter the AllRounder details\nEnter player name");
	    	String name111=br.readLine();
	    	System.out.println("Enter team name");
	    	String teamname111=br.readLine();
	    	System.out.println("Enter number of matches played");
	    	int noOfMatches111=Integer.parseInt(br.readLine());
	    	System.out.println("Enter the runs scored");
	    	int runs111=Integer.parseInt(br.readLine());
	    	System.out.println("Enter number of wickets taken ");
	    	int noOfWickets111=Integer.parseInt(br.readLine());
	    	AllRounder all=new AllRounder(name111, teamname111, noOfMatches111, runs111, noOfWickets111);
	    	all.displayPlayerStatistics();
	    	System.out.println("Do you want to continue?");
	    	String cont111=br.readLine();
	    	if(cont111.equalsIgnoreCase("YES"))
	    	{
	    	a=true;
	    	}
	    	else
	    	{
	    		a=false;
	    	}
	    		break;
	    		
	    		default :
	    			System.out.println("Please Enter a Valid Input");
	    			break;
	    		
	    		
	    }
	
	 }
	
	}

}
