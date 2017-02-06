import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class PlayerBO
{

  public Player createPlayer(String data)
   {
     String[] p=data.split(",");
     Player player=new Player(p[0],p[1],p[2]);
     return player;
   }

}

