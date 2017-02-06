import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
public static void main(String args[]) throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of players");
	int n=Integer.parseInt(br.readLine());
	String[] a=new String[n];
	System.out.println("Enter player names");
	for(int i=0;i<n;i++)
	{
		a[i]=br.readLine();
		if(a[i].contains("Sharma"))
		{
			System.out.println(a[i]);
		}
	}
}
}
