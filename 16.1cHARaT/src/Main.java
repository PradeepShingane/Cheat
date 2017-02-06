import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
public static void main(String args[]) throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter team1");
	String a=br.readLine();
	System.out.println("Enter team2");
	String b=br.readLine();
	System.out.println("Enter third character");
	String c=br.readLine();
	char d=c.charAt(0);
	if(d==a.charAt(2))
	{
		System.out.println("Winner Team : "+a);
	}
	else
		System.out.println("Winner Team : "+b);
}




}

