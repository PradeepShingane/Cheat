
public class WicketKeeper extends CricketPlayer implements IPlayerStatistics{
	private int noOfCatches,noOfStumpings,runs,noOfDismissals;

	

	public WicketKeeper(String name, String teamName, int noOfMatches,
			int noOfCatches, int noOfStumpings, int noOfDismissals,int runs) {
		super(name, teamName, noOfMatches);
		this.noOfCatches = noOfCatches;
		this.noOfStumpings = noOfStumpings;
		this.runs = runs;
		this.noOfDismissals = noOfDismissals;
	}


	public WicketKeeper() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void displayPlayerStatistics()
	{
		System.out.println("Player name : "+getName()+"\nTeam name : "+getTeamName()+"\nNo of matches : "+getNoOfMatches());
		System.out.println("No of catches taken : "+noOfCatches+"\nNo of stumpings : "+noOfStumpings+"\nNo of dismissals : "+noOfDismissals+"\nRuns scored : "+runs);
	}

}
