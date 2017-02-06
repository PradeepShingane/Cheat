
public class Venue {
	String	name;
	String	city;
	Venue(String	name,String	city)
	{
		this.name=name;
		this.city=city;
	}
	Venue()
	{
		
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return (name+","+city);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
