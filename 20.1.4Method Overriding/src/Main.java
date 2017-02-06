import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name,country,cn;
		long test,odi;
		System.out.println("Enter player name ");
		name=br.readLine();
		System.out.println("Enter player country");
		country=br.readLine();
		System.out.println("Enter the Cap number");
		cn=br.readLine();
		System.out.println("Enter the number of test appearnace");
		test=Long.parseLong(br.readLine());
		System.out.println("Enter the number of ODI appearnace");
		odi=Long.parseLong(br.readLine());
		
		InternationalPlayer ip=new InternationalPlayer(name,country,cn,test,odi);
		ip.displayDetails();
}

}
