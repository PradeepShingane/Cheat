import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Player p = null;
		FileUtility fu=new FileUtility();
		List playerList=new ArrayList<Player>();
		File inf=new File("input.txt");
		BufferedReader fis = new BufferedReader(new FileReader(inf));
		fu.readFileData(fis, p);
         File outf=new File("output.csv");
        fu.writeDataToFile(playerList);
	}

}
