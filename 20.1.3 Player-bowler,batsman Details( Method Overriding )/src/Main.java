import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String name,tname;
		long noOfMatch,wt,rs;
		System.out.println("Enter player name");
		name=br.readLine();
		System.out.println("Enter team name");
		tname=br.readLine();
		System.out.println("Enter number of matches");
		noOfMatch=Long.parseLong(br.readLine());
		
		System.out.println("Menu\n1.Bowler details\n2.Batsman details\nEnter choice");
		int ch=Integer.parseInt(br.readLine());
		switch(ch){
		case 1:
			System.out.println("Enter number of wicktes taken");
			wt=Long.parseLong(br.readLine());
			Bowler b=new Bowler(name,tname,noOfMatch,wt);
			b.displayDetails();
			break;
		case 2:
			System.out.println("Enter number of runs scored");
			rs=Long.parseLong(br.readLine());
			
			Batsman bm=new Batsman(name,tname,noOfMatch,rs);
			bm.displayDetails();
		break;
	}

}}
