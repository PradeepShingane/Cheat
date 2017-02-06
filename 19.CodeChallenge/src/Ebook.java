  
public class Ebook extends Book{

private String diskType;
private double size;

public Ebook(String name,String author,double price,String publication)
{
	super(name,author,price,publication);
}
public Ebook()
{
	
}

public String getDiskType() {
	return diskType;
}


public void setDiskType(String diskType) {
	this.diskType = diskType;
}


public double getSize() {
	return size;
}


public void setSize(double size) {
	this.size = size;
}


void displayDetails()
{
     System.out.println("Name of the book :"+this.name+"\nAuthor:"+this.author+"\nPrice:"+this.price+"\nPublication:"+this.publication+"\nDisk type:"+this.diskType+"\nSize:"+this.size);

}


}


