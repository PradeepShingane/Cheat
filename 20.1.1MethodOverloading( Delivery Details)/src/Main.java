import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
public static void main(String[] args) throws Exception, Exception 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Menu\n1.Player details of the delivery\n2.Run details of the delivery");
int n=Integer.parseInt(br.readLine());

Delivery d=new Delivery();
switch(n)
{
case 1:
System.out.println("Enter the bowler name");
String bowler=br.readLine();
System.out.println("Enter the batsman name");
String batsman=br.readLine();
d.displayDeliveryDetails(bowler, batsman);
break;
case 2:
	System.out.println("Enter the number of runs");
	long runs=Long.parseLong(br.readLine());
	d.displayDeliveryDetails(runs);
	break;
}
}
}
