
public class UserMainCode {

	public static boolean validatePlayer(String a)
	{
		String d="RCB, MI, CSK, SRH, KXIP, DD, KKR, RPSG, GL";
		String[] c=a.split(" ");
		if(c[0].equalsIgnoreCase(d))
		{
			return true;
		}
		else
			return false;
	}
}

	 