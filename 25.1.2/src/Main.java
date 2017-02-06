import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
public static void main(String[] args) throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	Set<String> hs = new TreeSet<String> ();
	for(int i=0;i<n;i++)
	{
		hs.add(br.readLine());
	}
	for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		System.out.println(string);
	}
}
}
