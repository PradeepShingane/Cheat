import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
public static void main(String[] args) throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	Set<String> hs = new HashSet<String> ();
	for(int i=0;i<n;i++)
	{
		hs.add(br.readLine());
	}
	System.out.println(hs.size());
}
}
