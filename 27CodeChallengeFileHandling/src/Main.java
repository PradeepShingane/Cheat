import java.io.*;
import java.util.ArrayList;
import java.util.*;
public class Main {

       public static void main(String[] args) throws Exception{
              
BufferedReader tom=new BufferedReader(new InputStreamReader(System.in));
    List ar=new ArrayList<Player>();
    System.out.println("Enter the number of the players");
    int a=Integer.parseInt(tom.readLine());
    for(int i=0;i<a;i++)
    {
    System.out.println("Enter details of player "+(i+1));
    System.out.println("Enter the player name:");
String b=tom.readLine();
    System.out.println("Enter the team name:");
    String c=tom.readLine();
    System.out.println("Enter the skill:");
    String d=tom.readLine();
    ar.add(new Player(b,c,d));
    FileUtility f=new FileUtility();
    f.writeDataToFile(ar);
    }
       }

}

