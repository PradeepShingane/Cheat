import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class Main 
{
public static void main(String args[]) throws Exception
{
	Match m=new Match();
	MatchFileStore mfs=new MatchFileStore();
	String filename = "matches.txt";
	InputStream fis = new FileInputStream(new File(filename));
	ArrayList<Match> alm=(ArrayList<Match>) mfs.obtainMatchFromFile(new InputStreamReader(fis));
	System.out.println("The Match Details are :");
	for (int i = 0; i < alm.size(); i++) {
		Match match= (Match)alm.get(i);
		m.displayMatch(match, (i+1));
	}
}
}
