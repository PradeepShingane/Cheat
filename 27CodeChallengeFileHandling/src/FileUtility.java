
import java.io.*;
import java.util.*;


public class FileUtility {

              public static void writeDataToFile(List<Player> playerList) throws Exception
                     {
                     File fl=new File("player.csv");
                           PrintWriter pw=new PrintWriter(fl);
                           if(!(fl.exists()))
                           {
                                  fl.createNewFile();
                           }
                           for(Player li :playerList)
                           {
                           String a=li.getName()+","+li.team+","+li.skill;
                           pw.write(a);
                           pw.write("\n");
                                                
                           }
                           pw.close();
                     }
                     

}


