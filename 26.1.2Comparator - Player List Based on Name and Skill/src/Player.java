import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;


public class Player implements Comparable<Player>{

	String name,skill;
	
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public Player() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Player : "+getName()+" Skill  : "+getSkill();
	}



	public int compareTo(Player arg0) {
		Player player=Player(arg0);
		PlayerComparator pc=new PlayerComparator();
		if(pc.compare(this, arg0)==1)
			return 1;
		else 
			return -1;
			
	}


	private Player Player(Player arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
