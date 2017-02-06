
public class Rectangle extends Shape{
private int length,breadth;

public Rectangle(int length,int breadth)
{super("Rectangle");
	this.length=length;
	this.breadth=breadth;
	
}
public Rectangle()
{
	
}
public double calculateArea()
{
	double area=length*breadth;
	return area;
}
public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getBreadth() {
	return breadth;
}

public void setBreadth(int breadth) {
	this.breadth = breadth;
}

}
