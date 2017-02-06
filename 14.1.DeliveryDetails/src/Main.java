import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]) throws Exception
	{
		
		long	over;
		long	ball;
		String	batsman;
		String	bowler;
		String	nonStriker;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of deliveries");
		int n=Integer.parseInt(br.readLine());
Delivery[] deliveryList=new Delivery[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the over");
			over=Long.parseLong(br.readLine());
			System.out.println("Enter the ball");
			ball=Long.parseLong(br.readLine());
			System.out.println("Enter the batsman");
			batsman=br.readLine();
			System.out.println("Enter the bowler");
			bowler=br.readLine();
			System.out.println("Enter the nonStriker");
	     	nonStriker=br.readLine();
	     deliveryList[i]=new Delivery(over,ball,batsman,bowler,nonStriker);
		}
	DeliveryBO d1=new DeliveryBO();
	d1.displayAllDeliveryDetails(deliveryList);
	}
	

}
