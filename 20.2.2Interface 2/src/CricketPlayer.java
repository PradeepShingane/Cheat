
public class CricketPlayer extends Player{
private int totalRunsScored,noOfWicketsTaken ;

public CricketPlayer() {
	super();
	// TODO Auto-generated constructor stub
}

public CricketPlayer(String name, String teamName, int noOfMatches) {
	super(name, teamName, noOfMatches);
	// TODO Auto-generated constructor stub
}

public CricketPlayer(String name, String teamName, int noOfMatches,
		int totalRunsScored, int noOfWicketsTaken) {
	super(name, teamName, noOfMatches);
	this.totalRunsScored = totalRunsScored;
	this.noOfWicketsTaken = noOfWicketsTaken;
}

public void displayPlayerStatistics()
{
	super.displayPlayerStatistics();
	System.out.println("Total runsscored : "+this.totalRunsScored+"\nNo of wickets taken : "+this.noOfWicketsTaken);
}

}
