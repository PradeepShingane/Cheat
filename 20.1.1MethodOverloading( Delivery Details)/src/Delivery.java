
public class Delivery {

	
	void displayDeliveryDetails(String bowler,String batsman) 
	{
		String[] a=bowler.split(" ");
		String[] b=batsman.split(" ");
		System.out.println("Bowler : "+a[1]+"\nBatsman : "+b[1]);
	}
	
	void displayDeliveryDetails(long runs)
	{
		System.out.println("Number of runs scored in the delivery : "+runs);
		if(runs==(long)4)
		{
			System.out.println("It is a Boundary.");
		}
		if(runs==(long)6)
		{
			System.out.println("It is a Sixer.");
		}
	
	}
}
