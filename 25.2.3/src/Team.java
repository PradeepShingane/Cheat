import java.util.ArrayList;


public class Team implements Comparable<Team> {

	String name;
	ArrayList<String> playerList=new ArrayList<String>();
	
	
	public Team(String name) {
		super();
		this.name = name;
	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<String> getPlayerList() {
		return playerList;
	}


	public void setPlayerList(ArrayList<String> playerList) {
		this.playerList = playerList;
	}


	public int compareTo(Object arg0) {
		if(this.name.compareTo(t.name))
			return this.name.compareTo(t.name);
	}

	

	@Override
	public String toString() {
		return name;
	}
	
	

}
