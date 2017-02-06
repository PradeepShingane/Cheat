import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String n[]=new String[2];
String c[]=new String[2];
String s[]=new String[2];

Player player[]=new Player[2];

for(int i=0;i<2;i++)
{
	System.out.println("Enter the player "+(i+1)+" details");
	System.out.println("Enter the player name");
	n[i]=br.readLine();
	System.out.println("Enter the country name");
	c[i]=br.readLine();
	System.out.println("Enter the skill");
	s[i]=br.readLine();
	
	player[i]=new Player(n[i],c[i],s[i]);
	System.out.println(player[i].getName()+" --- "+player[i].getCountry()+" --- "+player[i].getSkill());
}

if(player[0].equals(player[1]))
{
	System.out.println("Both the player details are same.");}

else
{System.out.println("Both the player details are not same.");}

}

}
