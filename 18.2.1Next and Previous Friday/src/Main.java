
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws Exception {
	
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter year in Integer");
int  year,month,day;
year= Integer.parseInt(br.readLine());
System.out.println("Enter Month in Integer");
month=Integer.parseInt(br.readLine());
System.out.println("Enter date in Integer");
day=Integer.parseInt(br.readLine());
UserMainCode.displayDate(year,month,day);
	}

}

