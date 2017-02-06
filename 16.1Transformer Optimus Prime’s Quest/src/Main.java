import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	String a=br.readLine();
	int x=0,y=0;
char[] b=new char[n];
b=a.toCharArray();
for(int i=0;i<n;i++)
{
	if(b[i]=='U')
	{
		y++;
	}
	else if(b[i]=='D')
	{
		y--;
	}
	else if(b[i]=='R')
	{
		x++;
	}
	else if(b[i]=='L')
	{
		x--;
	}
}
System.out.println(x+" "+y);
}
}