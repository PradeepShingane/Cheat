import java.util.*;  
import java.io.*;  
public class Main
{  
                public static void main(String args[]) throws Exception
                {  
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Team> al=new ArrayList<Team>();  
       int n=Integer.parseInt(br.readLine());
       int i;
       for(i=0;i<n;i++)
       {
                   String name=br.readLine();
                   String[] a=name.split("|");
                   al.add(new Team(a[0])); 
                   Team t=new Team(name); 
       }
       System.out.println("Team and Players in ascending order"); 
       Collections.sort(al); 
       for( Team p :al){  
                  
                   System.out.println("--"+p.getPlayerList());
                 
       }  
                } 
}
