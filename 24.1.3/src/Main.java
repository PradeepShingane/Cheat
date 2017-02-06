import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
	int count=0;
		 ArrayList<String> al = new ArrayList<String>();
     
      for(int i=0;i<n;i++)
      {
    		    al.add(s.nextLine());
    		    
	}
      String a=s.nextLine();
     
      for(int i=0;i<al.size();i++)
      {
		if(a.equals(al.get(i)))
		{
			count++;
		}
      }
		System.out.println(count);
	}
}


