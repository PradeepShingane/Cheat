
class Raider extends Player {
	private String noOfRaids,noOfRaidPoints;

	public String getNoOfRaids() {
		return noOfRaids;
	}

	public void setNoOfRaids(String noOfRaids) {
		this.noOfRaids = noOfRaids;
	}

	public String getNoOfRaidPoints() {
		return noOfRaidPoints;
	}

	public void setNoOfRaidPoints(String noOfRaidPoints) {
		this.noOfRaidPoints = noOfRaidPoints;
	}

	public Raider(String name, String teamName, String noOfMatches,
			String noOfRaids, String noOfRaidPoints) {
		super(name, teamName, noOfMatches);
		this.noOfRaids = noOfRaids;
		this.noOfRaidPoints = noOfRaidPoints;
	}

	public Raider(String name, String teamName, String noOfMatches) {
		super(name, teamName, noOfMatches);
	}
	
	void displayDetails()
	 {
		super.displayDetails();
		System.out.println("No. of Raids : "+getNoOfRaids());
		System.out.println("No. of Raid Points : "+getNoOfRaidPoints());
		
	 }
}
