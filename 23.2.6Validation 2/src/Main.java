import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String sb=br.readLine();
	
		if(UserMainCode.validateTeam(sb))
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
	}

}
