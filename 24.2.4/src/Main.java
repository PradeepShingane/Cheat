import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a=s.nextLine();
char[] b=a.toCharArray();
for(int i=b.length-1;i>=0;i--)
{
	System.out.println(b[i]);
}
	}

}
