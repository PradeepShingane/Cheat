
public class Player implements IPlayerStatistics {
	
	private String name;
	private String teamName;
	private int noOfMatches;
	private	long totalRunsScored;
	private	int noOfWicketsTaken ;
	public Player(String name, String teamName, int noOfMatches,
			long totalRunsScored, int noOfWicketsTaken) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void displayPlayerStatistics() {
		System.out.println("Player Details\nPlayer name : "+this.name+"\nTeam name : "+this.teamName+"\nNo of matches : "+this.noOfMatches+"\nTotal runsscored : "+this.totalRunsScored+"\nNo of wickets taken : "+this.noOfWicketsTaken);
		
	}
	
	
	
}
