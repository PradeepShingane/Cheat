import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;



public class Main {

	public static void main(String[] args) throws Exception, IOException {
	
		ArrayList<Team> hmap = new ArrayList<Team>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name;
long noOfMatches;
System.out.println("Enter number of teams:");
int n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
	System.out.println("Enter team "+(i+1)+" detail\nEnter Name");
	name=br.readLine();
	System.out.println("Enter number of matches");
	noOfMatches=Long.parseLong(br.readLine());
	
	hmap.add(new Team(name,noOfMatches));
}
TeamComparator tc=new TeamComparator();
Collections.sort(hmap,tc);
System.out.println("Team list after sort by number of matches");
for(Team t:hmap)
{
	System.out.println(t.toString());
}

}

}
