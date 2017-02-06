import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String name,teamname,matches;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the player ");
		name=br.readLine();
		System.out.println("Enter the team name");
		teamname=br.readLine();
		System.out.println("Enter the number of matches played");
		matches=br.readLine();
		File f=new File("player.csv");
		OutputStream os=new FileOutputStream(f) ;
			if(!f.exists())
				f.createNewFile();

               String s=name+","+teamname+","+matches;
               byte [] ba=s.getBytes();
               os.write(ba);
               os.close();
               os.flush();
}
}
