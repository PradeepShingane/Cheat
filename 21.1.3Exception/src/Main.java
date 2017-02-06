  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;  
class Main {
    public static void main(String args[]) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players");
		int n=Integer.parseInt(br.readLine());
		String cap,co,skill;
		Player ca=null;
		Player[] pl=new Player[n];
		PlayerBO bo=new PlayerBO();
		System.out.println("Do you know the details of the captain? Type Yes / No");
		String det=br.readLine();
String p,c,s;
		if(det.equalsIgnoreCase("Yes"))
				{
		System.out.println("Enter name of the captain");
		 cap=br.readLine();
		System.out.println("Enter country of the captain");
		 co=br.readLine();
		System.out.println("Enter skillset of the captain");
		skill=br.readLine();
		ca=new Player(cap,co,skill);
				}
		
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter name of player "+(i+1));
		p=br.readLine();
		System.out.println("Enter country of player "+(i+1));
		c=br.readLine();
		System.out.println("Enter skillset of player "+(i+1));
		s=br.readLine();
		 pl [i]=new Player(p, c, s);
		}
				
		
		
		try
		{
    		bo.displayPlayerDetails(ca);
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception Occured : "+e.getClass().getName());
    		System.out.println("Captain details not available");
    	}
    	finally{
    		System.out.println("Player Details");
    		for(int i=0;i<n;i++)
        	{
        		bo.displayPlayerDetails(pl[i]);
        	}
    	}
		}
    }

    	


