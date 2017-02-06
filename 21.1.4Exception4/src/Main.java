import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		Class m=Class.forName("Player");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			Player p=(Player) m.newInstance();
		}
		catch(Exception e)
		{
			System.out.println("Trying to invoke a no-argument constructor (that is not available) using newInstance method");
			System.out.println("Exception Occured : "+e.getClass().getName());
		}
		finally
		{
			System.out.println("Enter name of the player");
			String name=br.readLine();
			System.out.println("Enter country of the player");
			String co=br.readLine();
			System.out.println("Enter skillset of the player");
			String sk=br.readLine();
			System.out.println(name+", "+co+", "+sk);
		}
	}

}
