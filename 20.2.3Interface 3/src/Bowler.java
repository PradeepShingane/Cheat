
public class Bowler extends CricketPlayer implements IPlayerStatistics{
private int noOfWickets;



public Bowler(String name, String teamName, int noOfMatches, int noOfWickets) {
	super(name, teamName, noOfMatches);
	this.noOfWickets = noOfWickets;
}



public Bowler() {
	super();
	// TODO Auto-generated constructor stub
}



public void displayPlayerStatistics()
{
	System.out.println("Player name : "+getName()+"\nTeam name : "+getTeamName()+"\nNo of matches : "+getNoOfMatches());
	System.out.println("No of wickets taken : "+noOfWickets);
}

}
