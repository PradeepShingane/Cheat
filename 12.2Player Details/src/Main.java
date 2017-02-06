import java.util.Scanner;


public class Main {


public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String[] name=new String[2];
    String[] country=new String[2];
    String[] skill=new String[2];
    int flag=0;;
    for(int i=0;i<2;i++)
    {
    System.out.println("Enter the player "+(i+1)+" details");
    System.out.println("Enter the player name");
    name[i]=sc.nextLine();
    System.out.println("Enter the country name");
    country[i]=sc.nextLine();
    System.out.println("Enter the skill");
    skill[i]=sc.nextLine();
    Player player=new Player();
    player.setName(name[i]);
    player.setCountry(country[i]);
    player.setSkill(skill[i]);
    System.out.println(player.toString());
    }  
    for(int i=0;i<2;i++)
    {
    	if(name[i]==name[i+1] && country[i]==country[i+1] && skill[i]==skill[i+1])
    		flag=0;
    	else flag=1;
    }
    if (flag==0)
    	System.out.println("Both the player details are same.");
    else 
    	System.out.println("Both the player details are different.");
}
}

