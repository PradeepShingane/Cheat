import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;


public class Main {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String s=br.readLine();
		if(UserMainCode.validateDate(s))
				{
			System.out.println("Valid");
				}
		else
			System.out.println("Invalid");
	}

}
