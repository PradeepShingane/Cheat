
public class Batsman extends CricketPlayer implements IPlayerStatistics{
	private int runs;

	

	public Batsman(String name, String teamName, int noOfMatches, int runs) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
	}

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void displayPlayerStatistics(){
		System.out.println("Player name : "+getName()+"\nTeam name : "+getTeamName()+"\nNo of matches : "+getNoOfMatches());
		System.out.println("Runs scored : "+runs);
	}
}
