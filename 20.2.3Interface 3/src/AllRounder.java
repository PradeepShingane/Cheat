
public class AllRounder extends CricketPlayer implements IPlayerStatistics {
	private int runs,noofWickets;

	public AllRounder(String name, String teamName, int noOfMatches, int runs,
			int noofWickets) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
		this.noofWickets = noofWickets;
	}

	public AllRounder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AllRounder(String name, String teamName, int noOfMatches) {
		super(name, teamName, noOfMatches);
		// TODO Auto-generated constructor stub
	}
	public void displayPlayerStatistics(){
		System.out.println("Player name : "+getName()+"\nTeam name : "+getTeamName()+"\nNo of matches : "+getNoOfMatches());
		System.out.println("Runs scored : "+runs+"\nNo of wickets taken : "+noofWickets);
	}

}
