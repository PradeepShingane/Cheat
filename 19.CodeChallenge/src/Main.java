import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Main { 

public static void main(String args[]) throws IOException  { 

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the book name");
String bn=br.readLine();
System.out.println("Enter the author name");
String name=br.readLine();
System.out.println("Enter the price");
int price=Integer.parseInt(br.readLine());
System.out.println("Enter the publication name");
String publication=br.readLine();
System.out.println("Enter the type of book\n1.PrintedBook\n2.EBook");
int tb=Integer.parseInt(br.readLine());

Ebook e=new Ebook(bn,name,price,publication);
PrintedBook p=new PrintedBook(bn,name,price,publication);
switch(tb)
{
case 1:
	System.out.println("Enter the number of pages of the book");
	int pages=Integer.parseInt(br.readLine());
	System.out.println("Enter the binding type of the book");
	String bi=br.readLine();
	System.out.println("Enter the paper type of the book");
	String paper=br.readLine();
	System.out.println("Printed Book Details");
	
	e.displayDetails();
	
case 2:
	System.out.println("Enter the disk type of the book");
	String disk=br.readLine();
	System.out.println("Enter the size of the disk");
	int size=Integer.parseInt(br.readLine());
	System.out.println("EBook Details");
	p.displayDetails();
}
}

 
}

