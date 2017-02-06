import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MatchBO
{
 
 public Match createMatch(String data, Umpire[] umpireList)
  {
   
  Umpire u=null;
   String a[]=data.split(",");
   for(int i=0;i<umpireList.length;i++)
   {
	   if(umpireList[i].getName().equals(a[3]))
	   {
		   u=umpireList[i];
	   }
   }
   Match m=new Match(a[0],a[1],a[2],u);
   return m;
  }

  public Match findUmpire(String matchDate, Match[] matchList)
  {
	  Match m = null;
	  for(int i=0;i<matchList.length;i++)
	   {
		   if(matchList[i].getDate().equals(matchDate))
		   {
			   m=matchList[i];
		   }
	   }
	  return m;
  }
 
  public void findAllMatchesOfGivenUmpire(String umpireName, Match[] matchList)
  {
   for(int i=0;i<matchList.length;i++)
   {
	   if(matchList[i].getUmpire().getName().equals(umpireName))
	   {
		   System.out.println(matchList[i].toString());
	   }
   }
  }
}
