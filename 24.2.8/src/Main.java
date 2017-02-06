import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;


public class Main {
public static void  main(String [] args) throws Exception {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	ArrayList<String> al=new ArrayList<String>();
	for(int i=0;i<n;i++)
	{
		al.add(br.readLine());
	}
	
	String b=null;
	int c=0;
	 for (int i = 0; i<=al.size(); i++){
		 b=al.get(i);
		 String[] items=b.split("-");
		 if(items[1].equals("0") && items[2].equals("0"))
		 {
			 System.out.println(items[0]);
			 c++;
		 }
       
     }
	 if(c==0)
		 System.out.println("No player has scored a duck");
	
}
}
