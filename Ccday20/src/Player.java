
class Player {
	 protected String name, teamName, noOfMatches;
	 
	 
	 public Player(String name, String teamName, String noOfMatches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
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


	public String getNoOfMatches() {
		return noOfMatches;
	}


	public void setNoOfMatches(String noOfMatches) {
		this.noOfMatches = noOfMatches;
	}


	public Player() {
		super();
	}


	void displayDetails()
	 {
		System.out.println("Player Name : "+getName());
		System.out.println("Team Name : "+getTeamName());
		System.out.println("No. of Matches : "+getNoOfMatches());
	 }
}
