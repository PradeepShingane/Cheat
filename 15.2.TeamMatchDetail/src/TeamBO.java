import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class TeamBO
{

  
 public Team createTeam(String data, Player[] playerList)
{
  int l=playerList.length;
  Player p=new Player();
  String s[]=data.split(",");
  for(int i=0;i<l;i++)
  {
                  if(playerList[i].getName().equals(s[1]))
                  {
                                  p=playerList[i];
                  }
                                  
  }
  Team t=new Team(s[0],p);
  return t;
  
}



}
