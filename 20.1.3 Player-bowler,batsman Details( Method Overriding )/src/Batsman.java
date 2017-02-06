
public class Batsman extends Player{
private long noOfRuns;


public Batsman(String name, String teamName, long noOfMatches, long noOfRuns) {
	super(name, teamName, noOfMatches);
	this.noOfRuns = noOfRuns;
}


public Batsman() {
	
}


public Batsman(String name, String teamName, long noOfMatches) {
	super(name, teamName, noOfMatches);
	// TODO Auto-generated constructor stub
}


void displayDetails() {
	System.out.println("Bowler : "+getName()+"\nTeam : "+getTeamname()+"\nNumber of matches : "+getNoOfMatches()+"\nNumber of runs scored : "+this.noOfRuns);
} 
}