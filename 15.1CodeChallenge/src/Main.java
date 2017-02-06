import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,m;
		long inningsNumber;
		
		System.out.println("Enter the number of innings");
		n=Integer.parseInt(br.readLine());
		Innings[] inningsList=new Innings[n];
		InningsBO inningsBO=new InningsBO();
		
		String a;
		
		
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter innings "+(i+1)+" details");
		inningsNumber=Long.parseLong(br.readLine());
		inningsList[i]=	inningsBO.createInnings(inningsNumber);
	}
	System.out.println("Enter the number of events");
	m=Integer.parseInt(br.readLine());
	Event[] eventList=new Event[m];
	EventBO eventBO=new EventBO();
	for(int i=0;i<m;i++)
	{
		System.out.println("Enter event "+(i+1)+" details");
		a=br.readLine();
		eventList[i]=eventBO.createEvent(a, inningsList);
		
	}
	System.out.println("Enter the event number for which you need to find the innings number");
	inningsNumber=Long.parseLong(br.readLine());
	System.out.println("Innings: "+eventBO.findInningsNumber(eventList, inningsNumber));
	
	

	}

}


