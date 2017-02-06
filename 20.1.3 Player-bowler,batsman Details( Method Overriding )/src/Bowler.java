
public class Bowler extends Player{
private long noOfWickets;



public Bowler(String name, String teamName, long noOfMatches, long noOfWickets) {
	super(name, teamName, noOfMatches);
	this.noOfWickets = noOfWickets;
}


public Bowler() {
	
}


public Bowler(String name, String teamName, long noOfMatches) {
	super(name, teamName, noOfMatches);
	// TODO Auto-generated constructor stub
}


void displayDetails() {
	System.out.println("Bowler : "+getName()+"\nTeam : "+getTeamname()+"\nNumber of matches : "+getNoOfMatches()+"\nNumber of wickets taken : "+this.noOfWickets);
} 
}