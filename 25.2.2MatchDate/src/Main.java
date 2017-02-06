import java.util.*;  
import java.io.*;  
public class Main
{  
                public static void main(String args[]) throws Exception
                {  
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Match> al=new ArrayList<Match>();  
       System.out.println("Please provide the number of  players");
       int n=Integer.parseInt(br.readLine());
       int i;
       for(i=0;i<n;i++)
       {
                   System.out.println("Enter the name of the player "+(i+1));
                   String name=br.readLine();
                   System.out.println("Enter the score of the player "+(i+1));
                   int score=Integer.parseInt(br.readLine());
                  
                   al.add(new Match(name,score)); 
       }
       System.out.println("Player Details by Score(High to Low)"); 
       Collections.sort(al); 
       int k=1;
       for( Ranking p :al){  
                  
                   System.out.println(k+" "+p.getName()+" "+p.getScore());
                   k++;
       }  
                } 
}
