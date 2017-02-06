import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;


public class FileUtility {
	public List<Player> readFileData(BufferedReader ir,Player p) throws Exception
	{
		ArrayList<Player> l=new ArrayList<Player>();
		int capNumber = 0;
		String playerName,skill,country;
		int matchesPlayed;
		String line=null;
		BufferedReader g=new BufferedReader(ir);
		Collections.sort((List<Player>) l.get(capNumber));
	return l;
		
	}
	
	public void writeDataToFile(List<Player> playerList) throws Exception
	{
		 File fl=new File("player.csv");
         PrintWriter pw=new PrintWriter(fl);
         if(!(fl.exists()))
         {
                fl.createNewFile();
         }
         for(Player li :playerList)
         {
         String a=li.getCapNumber()+","+li.getPlayerName()+","+li.getSkill()+","+li.getCountry()+","+li.getMatchesPlayed();
         pw.write(a);
         pw.write("\n");
                              
         }
         pw.close();
   }
		
	}

