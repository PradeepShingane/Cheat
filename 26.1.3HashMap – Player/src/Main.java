import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i;
		Player p;
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
		String name,ch,ch1;
		do
		{
		System.out.println("Enter the player name");
	 name=br.readLine();
		System.out.println("Enter wickets - seperated by \"|\" symbol.");
		String wk=br.readLine();
		String wkCount[]=wk.split("\\|");
		i=wkCount.length;
		hm.put(name,i);
		System.out.println("Do you want to add another player (yes/no)");
		ch=br.readLine();
	}while(ch.equalsIgnoreCase("yes"));

		do
		{
		System.out.println("Enter the player name to search");
		String sname=br.readLine();
		if(hm.containsKey(sname))
		{
			System.out.println("Player name : "+sname);
			System.out.println("Wicket Count : "+hm.getOrDefault(sname,i));
		} 
		else
			System.out.println("No player found with the name "+sname);
		System.out.println("Do you want to search another player (yes/no)");
		ch1=br.readLine();
	}while(ch1.equalsIgnoreCase("yes"));

}
}
