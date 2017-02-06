import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;



public class Main {

	public static void main(String[] args) throws Exception, IOException {
	
		ArrayList<Player> hmap = new ArrayList<Player>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name;
int choice;
System.out.println("Please provide the number of players to be registered");
int n=Integer.parseInt(br.readLine());
String skill = null;
for(int i=0;i<n;i++)
{
	System.out.println("Please enter player name");
	name=br.readLine();
	System.out.println("Please select the skill of the player");
	System.out.println("1.All Rounder\n2.Batsman\n3.Bowler"); 
     choice=Integer.parseInt(br.readLine());
     if(choice==1)
    	 skill="All Rounder";
     else if(choice==2)
    	 skill="Batsman";
     else if(choice==3)
    	 skill="Bowler";
	hmap.add(new Player(name,skill));
}

Collections.sort(hmap);
System.out.println("Player Details");
for(Player t:hmap)
{
	System.out.println(t.toString());
}

}

}
