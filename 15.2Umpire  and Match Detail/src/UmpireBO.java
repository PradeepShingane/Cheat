import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class UmpireBO
{

 public Umpire createUmpire (String data, UmpireType[] umpireTypeList)
 {
    String arr[]=data.split(",");
    String n=arr[0];
    UmpireType uw=new UmpireType();
    for(int i=0;i<umpireTypeList.length;i++)
    {
    	if(umpireTypeList[i].getType().equals(arr[1]))
    	{
    		uw=umpireTypeList[i];
    	}
    }
    Umpire u1=new Umpire(n,uw);
    return u1;
 }

}
