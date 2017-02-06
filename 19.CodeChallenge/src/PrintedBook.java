
public class PrintedBook extends Book{

private int numOfPages;
private String bindingType,paperType;

public PrintedBook(String name,String author,double price,String publication)
{
	super( name, author, price,publication);
}
public PrintedBook()
{
	
}
public int getNumOfPages() {
	return numOfPages;
}


public void setNumOfPages(int numOfPages) {
	this.numOfPages = numOfPages;
}


public String getBindingType() {
	return bindingType;
}


public void setBindingType(String bindingType) {
	this.bindingType = bindingType;
}


public String getPaperType() {
	return paperType;
}


public void setPaperType(String paperType) {
	this.paperType = paperType;
}


void displayDetails()
{
	System.out.println("Name of the book :"+this.name+"\nAuthor:"+this.author+"\nPrice:"+this.price+"\nPublication:"+this.publication+"\nNumber of Pages:"+this.numOfPages+"\nBinding type:"+this.bindingType+"\nPper type:"+this.paperType);



}
}


