
public class Player {
protected String name,teamname;
protected long noOfMatches;

public Player(String name,String teamName,long noOfMatches)
{
	this.name=name;
	this.teamname=teamName;
	this.noOfMatches=noOfMatches;
}
public Player()
{
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTeamname() {
	return teamname;
}
public void setTeamname(String teamname) {
	this.teamname = teamname;
}
public long getNoOfMatches() {
	return noOfMatches;
}
public void setNoOfMatches(long noOfMatches) {
	this.noOfMatches = noOfMatches;
}
public void dispalyDetails()
{
	
}

}
