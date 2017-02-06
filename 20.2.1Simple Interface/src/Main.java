import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter player name");
		String name=br.readLine();
		System.out.println("Enter team name");
		String tname=br.readLine(); 
		System.out.println("Enter number of matches played");
		int noOfMatches=Integer.parseInt(br.readLine());
		System.out.println("Enter total runs scored");
		long totalRunsScored =Long.parseLong(br.readLine());
		System.out.println("Enter number of wickets taken");
		int noOfWicketsTaken=Integer.parseInt(br.readLine());
		Player p=new Player(name, tname, noOfMatches, totalRunsScored, noOfWicketsTaken);
		p.displayPlayerStatistics();
	}

}
