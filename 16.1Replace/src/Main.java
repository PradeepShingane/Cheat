import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
public static void main(String[] args) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter team details");
String a=br.readLine();
System.out.println("After replacement");
String b=a.replaceAll("Captain","Skipper");
System.out.println(b);

}
}
