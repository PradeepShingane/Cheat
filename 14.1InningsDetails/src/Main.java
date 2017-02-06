
import java.util.Scanner;


public class Main {

       public static void main(String[] args) {
              Scanner scanner= new Scanner(System.in);
              String battingTeam;
           long runs;
           Innings [] inningsList=new Innings[2];
           System.out.println("Enter the values for FirstInnings");
              System.out.println("Enter the BattingTeam");
              battingTeam=scanner.nextLine();
              System.out.println("Enter the runs scored");
              runs=scanner.nextLong();
              Innings innings= new Innings(battingTeam,runs);
              scanner.nextLine();
              inningsList[0]=new Innings(battingTeam,runs);
              System.out.println("Enter the values for SecondInnings");
              System.out.println("Enter the BattingTeam");
              battingTeam=scanner.nextLine();
              System.out.println("Enter the runs scored");
              runs=scanner.nextLong();
              inningsList[1]=new Innings(battingTeam,runs);
              InningsBO B=new InningsBO();
              B.displayAllInningsDetails(inningsList);
       }
}