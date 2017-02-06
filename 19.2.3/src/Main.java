import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Cricket Format");
		
		System.out.println("1.ODI");
		System.out.println("2.T20");
		System.out.println("3.Test");
		int form=Integer.parseInt(br.readLine());
		if(form>=4 || form<1)
		{
			System.out.println("Invalid Format type");
        	System.exit(0);
		}
		System.out.println("Enter the Current Score");
		int score=Integer.parseInt(br.readLine());
	        System.out.println("Enter the Current Over");
	        int over=Integer.parseInt(br.readLine());
	        System.out.println("Enter the Target Score");
	        int target=Integer.parseInt(br.readLine());
	        ODIMatch o=new ODIMatch(score,over,target);
	        TestMatch t=new TestMatch(score,over,target);
	        T20Match t20=new T20Match(score,over,target);
	        switch(form)
	        {
	        case 1:
	       	o.display(o.calculateRunrate(),o.calculateBalls());
	        case 2:
	        	t.display(t.calculateRunrate(),t.calculateBalls());
	        case 3:
	        	t20.display(t20.calculateRunrate(),t20.calculateBalls());
	        	
	        }
	        
	}

}


