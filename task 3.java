task 3:
question 
1)code:

package bookmanagement;

public class Book {
	
	public String title;
	public String author;
	//using contructor and methods
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	}
package bookmanagement;
import java.util.ArrayList;

public class Libary {
	
 private ArrayList < Book > books;
           //Arraylist interface using stored in list of books
	   {
	    books = new ArrayList < Book > ();
	  }

	  public void addBook(Book book) {
	    books.add(book);
	  }

	  public void removeBook(Book book) {
	    books.remove(book);
	  }

	  public ArrayList < Book > getBooks() {
	    return books;
	  }
	}

package bookmanagement;

public class BookManagementMain {

	public static void main(String[] args) {
		Libary libary1 = new Libary();

	    Book book1 = new Book("Adventures of Tom Sawyer", "Mark Twain");
	    Book book2 = new Book("Ben Hur", "Lewis Wallace");
	    Book book3 = new Book("Time Machine", "H.G. Wells");
	    Book book4 = new Book("Anna Karenina", "Leo Tolstoy");

	    libary1.addBook(book1);
	    libary1.addBook(book2);
	    libary1.addBook(book3);
	    libary1.addBook(book4);

	    System.out.println("Books in the library:");
	    for (Book book: libary1.getBooks()) {
	      System.out.println(book.getTitle() + " by " + book.getAuthor());
	    }
            //removebook to list of library books
	    libary1.removeBook(book2);
	    System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
	    for (Book book: libary1.getBooks()) {
	      System.out.println(book.getTitle() + " by " + book.getAuthor());
	    }
	  }
	}
output:
Books in the library:
Adventures of Tom Sawyer by Mark Twain
Ben Hur by Lewis Wallace
Time Machine by H.G. Wells
Anna Karenina by Leo Tolstoy

Books in the library after removing Ben Hur:
Adventures of Tom Sawyer by Mark Twain
Time Machine by H.G. Wells
Anna Karenina by Leo Tolstoy

Description:In above java program using book class create find bookname,author and to create library class to arraylist<> of books stored then create main class create an object and display books list to removebook() option in that list of books.

2)code:
---Employee details:
package taxablecharge;

public class Employee {
	int emp_id;
	String emp_name;
	double emp_salary;
	public Employee(int emp_id, String emp_name, double emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}
	void printEmployeeDetails()
	{
		System.out.println("Employee ID : " + emp_id);
		System.out.println("Employee Name : " + emp_name);
		System.out.println("Employee Salary : " + emp_salary);
	}
}
package taxablecharge;
import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		double tax=0,it;
		Scanner sc=new Scanner(System.in);
		Employee emp = new Employee(101,"sunil",25000.00);
		System.out.println("enter the Employee details");
	    emp.printEmployeeDetails();
		
		System.out.println("Enter income ");
		it=sc.nextDouble();
           //if condition excute in taxable item
		if(it<=200000)
			tax=0;
		else if(it<=300000)
			tax=0.1*(it-200000);
		else if(it<=500000)
			tax=(0.2*(it-300000))+(0.1*100000);
		else if(it<=1000000)
			tax=(0.3*(it-500000))+(0.2*200000)+(0.1*100000);
		else
			tax=(0.4*(it-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
		System.out.println("Income tax amount is "+tax);
		}
	
}
        

--code of product details:
package taxablecharge;

               public class Product {
               int pro_id;
 
               public Product(int pro_id) {
	         super();
	       this.pro_id = pro_id;
	
               }
               void PrintProductDetails()
               {
	       System.out.println("Product id:" + pro_id);
		
}
}
package taxablecharge;

import java.util.Scanner;

public class DriverMainPro {

	public static void main(String[] args) {
		
	        final double TAX_RATE=0.07;
	        double tax;
	        double total;
	        double price;
	        double item;
	      
	        Scanner keyboard=new Scanner(System.in);
	        Product pro1 = new Product(122);
			System.out.println("enter the Product Details");
		    pro1.PrintProductDetails();
		    System.out.print("Item price:      $");
		    price=keyboard.nextDouble();
		  
		    //calculations
		    tax=price*TAX_RATE;
		    total=price +tax;
		 
		    //display results
		 
		    System.out.print("item          $");
		      System.out.println(price);
		      System.out.print("Tax           $");
		      System.out.println(tax);
		      System.out.print("Total $");
		      System.out.println(total);
		    }
	}
output:
---calculate employee salary(income tax)
enter the Employee details
Employee ID : 101
Employee Name : sunil
Employee Salary : 25000.0
Enter income 
300000
Income tax amount is 10000.0
---Calculate product price(sales tax)
enter the Product Details
Product id:122
Item price:      $99.8
item          $99.8
Tax           $6.986000000000001
Total $106.786

Description:In above java program using employee class create an id,name,salary then main drive using get income salary calculate in tax value logic condition is true to excuted.
Then next using product details create an id,price,quantity and implement main driver calculate sales tax in particular item price then excuted item price and total tax.
		    

	




