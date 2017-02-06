import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the team name");
		String a=s.nextLine();
		
		System.out.println("Enter the number of matches played in home ground ");
		int n=s.nextInt();
		s.nextLine();
		 System.out.println("Enter the runs scored");
	int count=0;
		 ArrayList<String> al1 = new ArrayList<String>();
     
      for(int i=0;i<n;i++)
      {
    		    al1.add(s.nextLine());
    		    
	}
     // String a=s.nextLine();
      ArrayList<String> al2 = new ArrayList<String>();
      System.out.println("Enter the number of matches played in other ground ");
		int n1=s.nextInt();
		s.nextLine();
      System.out.println("Enter the runs scored");
      for(int i=0;i<n1;i++)
      {
    		    al2.add(s.nextLine());
    		    
	}
		System.out.println("Runs scored by "+a);
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(al1);
		al.addAll(al2);
		for(String temp: al){
            System.out.println(temp);
	}
		
}
}


