import java.util.Scanner;


public class Main {

       public static void main(String[] args) {
              // TODO Auto-generated method stub
    	   Scanner sc=new Scanner(System.in);
              String name = null;
              String country = null;
              String skill = null;
              System.out.println("Enter the number of players");
              int n=sc.nextInt();
              sc.nextLine();
              Player[] playerList=new Player[n];
              for(int i=0;i<n;i++)
              {
              System.out.println("Enter the player name");
              name=sc.nextLine();
              System.out.println("Enter the country name");
              country=sc.nextLine();
              System.out.println("Enter the skill");
              skill=sc.nextLine();
              playerList[i]=new Player(name,country,skill);
              }
             
              PlayerBO p=new PlayerBO();
              p.displayAllPlayerDetails(playerList);
       }

}
