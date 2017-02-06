
public abstract class Player {
	protected String name,teamName;
	protected int noOfMatches ;
	public Player(String name, String teamName, int noOfMatches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public void displayPlayerStatistics()
	{
		System.out.println("Player Details\nPlayer name : "+this.getName()+"\nTeam name : "+this.teamName+"\nNo of matches : "+this.noOfMatches);
	}
}
