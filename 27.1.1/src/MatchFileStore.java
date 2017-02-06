import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MatchFileStore 
{
	public List<Match> obtainMatchFromFile(InputStreamReader ir) throws Exception
	{
		Match m;
		String teamOne,teamTwo,venue,matchDate;
		
		String line = null;
		ArrayList<Match> alm=new ArrayList<Match>();
		
		BufferedReader br = new BufferedReader(ir);
		while(((line=br.readLine())!=null))
		{
			teamOne=line.substring(0, 5).trim();
			teamTwo=line.substring(5, 10).trim();
			venue=line.substring(10, 30).trim();
			matchDate=line.substring(30, 40).trim();
			m=new Match(teamOne,teamTwo,venue,matchDate);
			alm.add(m);
		}
		return alm;
	}
	
}
