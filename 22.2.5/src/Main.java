import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		//System.out.println("Enter the player details");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
	    UserMainCode.validatePlayer(a,b);
	    
	    if(UserMainCode.validatePlayer(a,b))
	    System.out.print("Valid");
	    else
	    System.out.print("Invalid");
	     
	   }
		
	}


