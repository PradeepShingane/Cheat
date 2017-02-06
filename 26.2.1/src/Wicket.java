
public class Wicket {

	String playerName;
	Bowler b;
	public Wicket(String playerName, Bowler b) {
		super();
		this.playerName = playerName;
		this.b = b;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Bowler getB() {
		return b;
	}
	public void setB(Bowler b) {
		this.b = b;
	}
	
}
