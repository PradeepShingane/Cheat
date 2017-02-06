import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
public static void main(String args[]) throws Exception, Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println(" Menu\n1.Match Date\n2.Match Venue\n3.Match Outcome");
    int n=Integer.parseInt(br.readLine());
    Match m=new Match();
    switch(n)
    {
    	case 1:
    		System.out.println("Enter the date of the match");
    		String date=br.readLine();
    		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    		Date matchdate=sdf.parse(date);
    		m.displayMatchDetails(matchdate);
    		break;
    		
    	case 2:
    		System.out.println("Enter venue of the match");
    		String vn=br.readLine() ;
    		m.displayMatchDetails(vn);
    		break;
    		
    	case 3:
    		System.out.println("Enter the winner team of the match");
            String wt=br.readLine();
            System.out.println("Enter the number of runs");
            long runs=Long.parseLong(br.readLine());
            m.displayMatchDetails(wt, runs);
            break;
    
    
    }



}
}
