
public class Player implements Comparable<Player>{
int capNumber;
String playerName,skill,country;
int matchesPlayed;
public Player(int capNumber, String playerName, String skill, String country,
		int matchesPlayed) {
	super();
	this.capNumber = capNumber;
	this.playerName = playerName;
	this.skill = skill;
	this.country = country;
	this.matchesPlayed = matchesPlayed;
}
public int getCapNumber() {
	return capNumber;
}
public void setCapNumber(int capNumber) {
	this.capNumber = capNumber;
}
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getMatchesPlayed() {
	return matchesPlayed;
}
public void setMatchesPlayed(int matchesPlayed) {
	this.matchesPlayed = matchesPlayed;
}
public int compareTo(Player arg0) {
	// TODO Auto-generated method stub
	
			
}



}
