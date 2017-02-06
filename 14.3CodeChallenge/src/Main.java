import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{

public static void main(String args[]) throws IOException{


  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Integer i,n;
   String eType,scoringTeam;
  Long points,eventNo;
   
   System.out.println("Enter the number of events");
   n=Integer.parseInt(br.readLine());
  
   ExtraType[] extratype=new ExtraType[n];
   for(i=0;i<n;i++)
   {
  System.out.println("Enter the event number");
eventNo=Long.parseLong(br.readLine());
  System.out.println("Enter the extra type");
  eType=br.readLine();

 
  System.out.println("Enter the points scored");
  points=Long.parseLong(br.readLine());
 
   System.out.println("Enter the scoring team");
  scoringTeam=(br.readLine());   

   extratype[i] = new ExtraType(eventNo,eType,points,scoringTeam);
   
  }

ExtraTypeBO etBo=new ExtraTypeBO();
etBo.displayExtraTypeDetails(extratype);
  



}


}


