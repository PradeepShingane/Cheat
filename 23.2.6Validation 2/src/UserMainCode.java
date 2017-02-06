
public class UserMainCode {

	public static boolean validateTeam(String name)
	{
		String arr[]={"RCB","MI","CSK","SRH","KXIP","DD","KKR","RPSG","GL"};
		String a[]=name.split(" ");
		int flag=0,var;
		for(int i=0;i<arr.length;i++)
		{
			if(a[0].equalsIgnoreCase(arr[i]))
			{
				flag++;
			}
		
			
		}
		if(flag!=0 )
			{
			try{
				var=Integer.parseInt(a[1]);
		     return true;
	     }
			catch(Exception e)
			{
			return false;
			}
			}
		else 
			{
			return false;
		}
	}
}
