import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MatchBO
{
   
 public Match createMatch(String data, Team[] teamList)
  {
       int l=teamList.length;
       Team t=new Team();
         String s[]=data.split(",");
         for(int i=0;i<l;i++)
         {
                if(teamList[i].getName().equals(s[1]))
                {
                       t=teamList[i];
                }
                       
         }
         
         Match m=new Match(s[0],s[1],s[2],s[3],t);
         
         return m;
    //fill your code
  }

  public Match findTeam(String matchDate, Match[] matchList)
  {
         int l=matchList.length;
         Match m=new Match();
         for(int i=0;i<l;i++)
         {
                if(matchList[i].getDate().equals(matchDate))
                {
                       m.teamone=matchList[i].getTeamone();
                       m.teamtwo=matchList[i].getTeamtwo();
                }
         }
         return m;
    //fill your code
   
  }

  public void findAllMatchesInGivenTeam(String teamName, Match[] matchList)
  {
         Match m=new Match();
         int l=matchList.length;
         String b[]={"Date","TeamOne","TeamTwo","Venue"};
         String a=String.format("%-15s %-15s %-15s %s",b);
         System.out.println(a);
         for(int i=0;i<l;i++)
         {
                if(matchList[i].getTeamone().equals(teamName))
                {
                       System.out.println(matchList[i].toString());
                }
         }
    //fill your code
  
   }


  
}
