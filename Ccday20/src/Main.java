import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name, teamName, noOfMatches,noOfRaids,noOfRaidPoints,noOfDefencePoints;
		System.out.println("Enter player name");
		name=br.readLine();
		System.out.println("Enter team name");
		teamName=br.readLine();
		System.out.println("Enter number of matches");
		noOfMatches=br.readLine();
		System.out.println("Menu"+"\n1.Raider details"+"\n2.Defender details"+"\nEnter choice");
		int ch=Integer.parseInt(br.readLine());
		switch (ch) {
		case 1:
			System.out.println("Enter number of raids");
			noOfRaids=br.readLine();
			System.out.println("Enter number of raid points");
			noOfRaidPoints=br.readLine();
			Raider raider=new Raider(name, teamName, noOfMatches, noOfRaids, noOfRaidPoints);
			raider.displayDetails();
			break;
		case 2:
			System.out.println("Enter number of defence points");
			noOfDefencePoints=br.readLine();
			Defender defender =new Defender(name, teamName, noOfMatches, noOfDefencePoints);
			defender.displayDetails();
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
		
		
		
	}

}
