
class Defender extends  Player{
    private	String noOfDefencePoints;

	public String getNoOfDefencePoints() {
		return noOfDefencePoints;
	}

	public void setNoOfDefencePoints(String noOfDefencePoints) {
		this.noOfDefencePoints = noOfDefencePoints;
	}

	public Defender(String name, String teamName, String noOfMatches,
			String noOfDefencePoints) {
		super(name, teamName, noOfMatches);
		this.noOfDefencePoints = noOfDefencePoints;
	}

	public Defender(String name, String teamName, String noOfMatches) {
		super(name, teamName, noOfMatches);
	}
	void displayDetails()
	 {
		super.displayDetails();
		System.out.println("No. of Defence Points : "+getNoOfDefencePoints());
			
	 }

}
