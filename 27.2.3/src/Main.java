import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
InputStream i=new FileInputStream(new File("outcome.txt"));
int a=s.nextInt();
int b=s.nextInt();
BufferedReader br=new BufferedReader(new InputStreamReader(i));
String sc=br.readLine().substring(a, b);
System.out.println(sc);
	}

}
