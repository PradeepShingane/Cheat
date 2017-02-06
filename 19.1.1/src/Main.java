import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		Thread[] tl=new Thread[3];
		String matchType = null,scoreString;
		int[] scores;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		for(int i=0;i<tl.length;i++)
		{
            System.out.println("Enter the Match :");
		    matchType=br.readLine();
		    System.out.println("Enter the Scores :");
		    scoreString=br.readLine();
		    tl[i]=new SortScore(matchType, scoreString);
		    tl[i].start();
		   
		}
		for(int i=0;i<3;i++)
		 tl[i].join();
	
		System.out.println("Ordered Score List");
		for(int i=0;i<tl.length;i++)
		{
			System.out.println("Match : "+((SortScore) tl[i]).getMatchType());
			for(int m:((SortScore)tl[i]).getScores())
				System.out.println(m+"");
		}
		 
		}
		
		
	

}

