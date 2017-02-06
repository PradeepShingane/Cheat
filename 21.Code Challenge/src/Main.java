import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CustomException cm;
		try
		{
			System.out.println("Enter the player name");
			String name=s.nextLine();
			System.out.println("Enter the player age");
			int age=s.nextInt();
			if(age<19)
				 cm=new CustomException(name);
			else
			{
				System.out.println("Player name : "+name+"\nPlayer age : "+age);
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
