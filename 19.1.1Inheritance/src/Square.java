
public class Square extends Shape{
private int side;

public Square(int side)
{
	super("Square");
	this.side=side;
}
public Square()
{
	
}

public double calculateArea()
{
  double area=side*side;
 return area;
}
public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}
}
