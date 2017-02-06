import java.text.SimpleDateFormat;
import java.util.Date;


public class Match {
	void displayMatchDetails(Date matchDate)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
		String d=sdf.format(matchDate);
		System.out.println("Match Date : "+d);
	}
	
	void displayMatchDetails(String venue) 
	{
		String[] v=venue.split(",");
		System.out.println("Match Venue :\nStadium : "+v[0]+"\nCity : "+v[1]);
	}

	void displayMatchDetails(String winnerTeam,long runs) 	
	{
		System.out.println("Match Outcome :\n"+winnerTeam+" won by "+runs+" runs");
	}
	
}
