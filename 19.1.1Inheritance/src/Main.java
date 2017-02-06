import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		NumberFormat f=new DecimalFormat("##.00");
		System.out.println("1. Rectangle\n2. Square\n3. Circle");
	System.out.println("Area Calculator --- Choose your shape");
	int a=Integer.parseInt(br.readLine());
	if(a==1)
	{
		System.out.println("Enter length and breadth:");
		int length,breadth;
		length=Integer.parseInt(br.readLine());
		breadth=Integer.parseInt(br.readLine());
		Rectangle r=new Rectangle(length,breadth);
		r.calculateArea();
		System.out.println("Area of "+Shape.shapeName+" is:"+f.format(r.calculateArea()));
	}
	
	if(a==2)
	{
		System.out.println("Enter side:");
		int side;
		side=Integer.parseInt(br.readLine());
	
	Square s=new Square(side);
		s.calculateArea();
		
		System.out.println("Area of "+Shape.shapeName+" is:"+f.format(s.calculateArea()));
	}
	
	if(a==3)
	{
		System.out.println("Enter Radius:");
		int radius;
		radius=Integer.parseInt(br.readLine());
	
Circle c=new Circle(radius);
		c.calculateArea();
		System.out.printf("Area of "+Shape.shapeName+" is:%.2f",c.calculateArea());
	}
	}

}
