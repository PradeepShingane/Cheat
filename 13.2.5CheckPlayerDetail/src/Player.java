
public class Player {

	String name;
	String country ;
	String skill ;
	
	
	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public boolean equals(Player player)
	{
		boolean f=false;
		if(this.name.equals(player.name))
		{
			if(this.country.equals(player.country))
			{
				if(this.skill.equals(player.skill))
				{
					f=true;
				}
			}
		}
		else
		f=false;
		return f;
		} 
}

	
	

