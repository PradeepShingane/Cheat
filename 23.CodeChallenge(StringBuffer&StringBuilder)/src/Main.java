import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		//System.out.println("Enter the player details");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		// String b=s.next();
		// String one=a.concat(b);
	    UserMainCode.validateTeam(a);
	    
	    if(UserMainCode.validateTeam(a))
	    System.out.print("Lucky");
	    else
	    System.out.print("Unlucky");
	     
	   }
		
	}


