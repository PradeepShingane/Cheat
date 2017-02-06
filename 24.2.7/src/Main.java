import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
public static void  main(String [] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of matches");
	int n=s.nextInt();
int k=0,count=0,flag=0;
	System.out.println("Enter the runs scored by the team");
	ArrayList<Integer> ar=new ArrayList<Integer>();
	//System.out.println("Enter the top 5 scorers of IPL Season 8");
	for(int i=0;i<n;i++)
	{
		ar.add(s.nextInt());
		
		for(int j=2;j<ar.get(i)/2;j++)
		{
			if(ar.get(i)%j==0)
			{
				count++;
				break;
			}
		}
		
	} 
	
	System.out.println("Number of prime scores : "+(n-count));
	
}
}
