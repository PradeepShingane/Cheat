import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class DeliveryBO
{
  
     public Delivery createDelivery(String data,Innings[] inningsList) {
      String[] a=data.split(",");
      
      Innings in=new Innings();
      for(int i=0;i<inningsList.length;i++)
      {
    	  if(inningsList[i].getInningsNumber()==Long.parseLong(a[4]))
    	  {
    		  in=inningsList[i];
    	  }
    		  
    	  
      }
     Delivery d=new Delivery(Long.parseLong(a[0]),a[1],a[2],Long.parseLong(a[3]),in);
     return d;
           
      }


 public long findInningsNumber(Delivery [] deliveryList, long deliveryNumber)

  {
	 long a = 0;
   for(int i=0;i<deliveryList.length;i++)
   {
	   if(deliveryList[i].getDeliveryNumber()==deliveryNumber)
	   {
		  a= deliveryList[i].getInnings().getInningsNumber();
	   }
	   
   }
   return    a;


 }
}
