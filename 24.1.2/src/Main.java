import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
		 ArrayList<Integer> al = new ArrayList<Integer>();
     
      for(int i=0;i<n;i++)
      {
    		    al.add(i, s.nextInt());
    		    
	}
     Collections.sort(al);
     for (Iterator iterator = al.iterator(); iterator.hasNext();) {
		Integer integer = (Integer) iterator.next();
		System.out.println(integer);
	}
}
}

