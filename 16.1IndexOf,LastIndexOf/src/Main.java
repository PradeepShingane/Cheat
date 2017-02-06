import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
public static void main(String args[]) throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of players");
	int n=Integer.parseInt(br.readLine());
	String [] a=new String[n];
	String c=null;
	int count=0;
	for(int i=0;i<n;i++)
	{
		a[i]=br.readLine();
		if(a[i].indexOf('a')==a[i].lastIndexOf('a'))
		{
			c=a[i];
		}
	}
			System.out.println("Player of the Match:");
			System.out.println(c);
		}
	}

