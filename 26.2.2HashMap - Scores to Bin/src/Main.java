import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	Histogram hg = null;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,bin = 0,score,bin1 = 0,bin2 = 0,bin3 = 0,bin4 = 0,key = 0;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(i=0;i<n;i++)
		{
			score=s.nextInt();
			
			if(score>0 && score <=10)
			{
				key=10;
				bin=bin1++;
			}
			else if(score>10 && score<=20)
			{
				key=20;
				bin=bin2++;
			}
			else if(score>20 && score<=30)
				
				{
				key=30;
				
				bin=bin3++;
				}
			else if(score>30 && score<=40)
				{
				key=40;
				bin=bin4++;
				}
			hm.put(key,bin);
			hg.addScore(key);
			hg.displayHistogram(hm);
		}
		
	
	}

}
