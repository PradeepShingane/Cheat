
public class Book {
    
protected String name,author,publication;
protected double price;

public Book(String name,String author,double price,String publication) 
{
	this.author=author;
	this.name=name;
	this.price=price;
	this.publication=publication;

}
public Book()
{
	
}
//fill the code

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getPublication() {
	return publication;
}

public void setPublication(String publication) {
	this.publication = publication;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

void displayDetails()
{

      
}
}


