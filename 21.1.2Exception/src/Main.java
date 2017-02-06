import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
			Scanner sc =new Scanner(System.in);
					System.out.println("Enter the number of overs");
					try{
					int n=sc.nextInt();
					int arr[]=new int [n];
					
					System.out.println("Enter the number of runs for each over");
					for(int i=0;i<n;i++)
					{
						arr[i]=sc.nextInt();
					}
					System.out.println("Enter the over number");
					int o=sc.nextInt();
					System.out.println(arr[o-1]);
				}
					catch(Exception e)
					{
						System.out.println(e.getClass().getName());
					}
				}  

	}
