import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String a,b;
System.out.println("Enter player names");
a=br.readLine();
b=br.readLine();
if(a.regionMatches(0,b,0,7))
{
	System.out.println("Both the players names starts with "+a.substring(0,7));
}
else
{
	System.out.println("Both the players names does not starts with "+a.substring(0,7));
}
}
}
