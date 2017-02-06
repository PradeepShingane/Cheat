
public class UserMainCode {
	public static boolean validateTeam(String one) 
	{
		char a[]=one.toCharArray();
		int count =0,flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				if(a[i]=='a'||a[i]=='A' ||a[i]=='e'||a[i]=='E' ||a[i]=='i'||a[i]=='I' ||a[i]=='o'||a[i]=='O' ||a[i]=='u'||a[i]=='U')
				{
					count++;
				}
			} 
	else
			{
				if(a[i]=='a'||a[i]=='A' ||a[i]=='e'||a[i]=='E' ||a[i]=='i'||a[i]=='I' ||a[i]=='o'||a[i]=='O' ||a[i]=='u'||a[i]=='U')
				{
					flag++;
				}
			}
		}
		
		if(flag<=count)
		return true;
		else
			return false;
	}
	} 
