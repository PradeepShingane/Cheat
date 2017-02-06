import java.util.Scanner;


public class Main {
	public static void main(String args[])
	{
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the venue name");
	String	name=s.nextLine();
	System.out.println("Enter the city name");
	String	city=s.nextLine();
	Venue v=new Venue(name,city);
	VenueBO v1=new VenueBO();
	v1.displayVenueDetails(v);
}
}
