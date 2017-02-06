
public class Innings {
	String battingTeam;
	long runs;
	public String getBattingTeam() {
		return battingTeam;
	}
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	Innings(String battingTeam,
	long runs)
	{
		this.battingTeam=battingTeam;
		this.runs=runs;
	}
	Innings()
	{
		
	}
	public String toString() {
		
		return String.format("%-20s %-20s",battingTeam,runs);
	}
	
}
