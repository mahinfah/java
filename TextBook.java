import java.lang.*;
public class TextBook
{
	String isbn;
		String bookTitle ;
		String authorName;
		double price;
		int availableQuantity;
		int standard ;
		static double discountRate;
		
		TextBook(String isbn ,String bookTitle, String authorName, double price, int availableQuantity ,int standard){
			setIsbn(isbn);
           setBookTitle(bookTitle);
           setAuthorName(authorName);
           setPrice(price);
           setAvaiableQuantity(availableQuantity);		  
	       setStandard(standard);
			
		}
		TextBook(){
			System.out.println("-------empty c--------");
		}
		
		void setIsbn(String isbn)
		{
	     this.isbn=isbn;
		 
}
void setBookTitle(String bookTitle){
	
this.bookTitle=bookTitle;
 }

void setAuthorName(String authorName){
	
	this.authorName=authorName;
}
void setPrice(double price){
	this.price=price;
	
}
void setAvaiableQuantity(int availableQuantity){
	
this.availableQuantity=availableQuantity;
	
}

void setStandard(int standard){
	this.standard=standard;
	
}
String getIsbn(){
	return isbn;
	
}
String getBookTitle(){
	return bookTitle;
	
}
String getAuthorName( ){
	
	return authorName;

}
double getPrice( ){
	return price ;
}

int getAvailableQuantity( ){
	return availableQuantity;
	
} 
int getStandard( ){
	return standard;
	
	
}
void addQuantity(int amount){ 

	availableQuantity=availableQuantity-amount;

}
static void setDiscountRate(double Rate){
	
	discountRate=Rate;
	
}
static double getDiscountRate(){
	return discountRate;
	
}
void sellQuantity(int amount){
	
	availableQuantity=availableQuantity-amount;
	
}
void showDetails(){
	
System.out.println("ISBN :"+isbn);	
	
	System.out.println("BOOK TITLE         :"+bookTitle);
	
	System.out.println("AUTHOR NAME        :"+authorName);
	
	System.out.println("PRICE              :"+price);
	
	System.out.println("AVAILABLE QUANTITY :"+availableQuantity);
	
	System.out.println("STANDARD           :"+standard);
	 

	System.out.println("Discount           :"+discountRate);
	
	
}
}