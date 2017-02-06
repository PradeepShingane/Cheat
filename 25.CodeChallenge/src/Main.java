import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
public class Main {
 
       private static final char[] Character = null;
 
       public static void main(String[] args) throws NumberFormatException, IOException {
              BufferedReader tom=new BufferedReader(new InputStreamReader(System.in));
              String a,c;
              int sum=0;
              int b;
              float contribution;
            TreeSet<Revenue> ts=new TreeSet<Revenue>();
            do
            {
            System.out.println("Enter revenue category");
            a=tom.readLine();
            System.out.println("Enter revenue amount");
            b=Integer.parseInt(tom.readLine());
            sum=sum+b;
            Revenue r=new Revenue(a,b);
            System.out.println("Do you want to continue(yes/no):");
            c=tom.readLine();
            ts.add(r);
            }while(!(c.equalsIgnoreCase("no")));
            System.out.println("Top spending categories");
            System.out.println(String.format("%-15s%-15s","Category", "Amount"));
            for(Revenue e:ts)
            {
               e.display1();
            }
            System.out.println("Total amount earned: "+sum);
            System.out.println(String.format("%-15s%-15s","Category", "Contribution"));
            
            for(Revenue e:ts)
            {
         
           
                     //System.out.println(String.format("%-15s%-15s","Category", "Amount"));
            		e.display2(sum);
                   
             
            }
       }
}
       
       
 

