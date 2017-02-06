  class Player 
{
    private String name,country,skill;
	
	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public Player()
	{
		
	}
	public void setName(String nn)
	{
		name=nn;
	}
	public void setCountry(String cc)
	{
		country=cc;
	}
	public void setSkill(String ss)
	{
		skill=ss;
	}
	public String getName()
	{
		return name;
	}
	public String getCountry()
	{
		return country;
	}
	public String getSkill()
	{
		return skill;
	}
	
}

