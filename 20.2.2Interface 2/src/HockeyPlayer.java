
public class HockeyPlayer extends Player{
private String Position;
private int noOfGoals;

public HockeyPlayer(String name, String teamName, int noOfMatches,
		String position, int noOfGoals) {
	super(name, teamName, noOfMatches);
	Position = position;
	this.noOfGoals = noOfGoals;
}

public HockeyPlayer() {
	super();
	// TODO Auto-generated constructor stub
}

public HockeyPlayer(String name, String teamName, int noOfMatches) {
	super(name, teamName, noOfMatches);
	// TODO Auto-generated constructor stub
}

public void displayPlayerStatistics()
{
	super.displayPlayerStatistics();
	System.out.println("Position : "+this.Position+"\nNo of goals taken : "+this.noOfGoals);
}

}
