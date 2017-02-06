import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the player name");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		 StringBuffer sb = new StringBuffer(a);
	      sb.append("#");
	      System.out.println("Enter the team name"); 
	      String b=s.nextLine();
	      StringBuffer sb1=new StringBuffer(b);
	    UserMainCode.display(sb, sb1);
	     
	   }
		
	}


