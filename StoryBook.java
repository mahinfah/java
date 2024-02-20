import java.lang.*;
public class StoryBook
{
		String isbn;
		String bookTitle ;
		String authorName;
		double price;
		int availableQuantity;
		String category;
		static double discountRate;
		
		StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category){
	       setIsbn(isbn);
           setBookTitle(bookTitle);
           setAuthorName(authorName);
           setPrice(price);
           setAvaiableQuantity(availableQuantity);		  
	       setCategory(category);
		}
		StoryBook(){
			System.out.println("-------empty c--------");
		}
void setIsbn(String isbn){
	this.isbn=isbn;
}
void setBookTitle(String bookTitle){
this.bookTitle=bookTitle;  
            }

void setAuthorName(String authorName)
{
	this.authorName=authorName;
}
void setPrice(double price){
	this.price=price;
	
}
void setAvaiableQuantity(int availableQuantity){
	
this.availableQuantity=availableQuantity;
	
}

void setCategory(String category){
	this.category=category;
	
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
String getCategory( ){
	return category;
	
	
}
void addQuantity(int amount){
 
 availableQuantity=availableQuantity+amount;

}
static void setDiscountRate(double rate){
	 
	 discountRate=rate;
	
}
static double getDiscountRate(){
	return discountRate;
	
}
void sellQuantity(int amount){
	
	
	availableQuantity=availableQuantity-amount;
	
}

void showDetails(){
	
    System.out.println("ISBN               :"+isbn);	
	
	System.out.println("BOOK TITLE         :"+bookTitle);
	
	System.out.println("AUTHOR NAME        :"+authorName);
	
	System.out.println("PRICE              :"+price);
	
	System.out.println("AVAILABLE QUANTITY :"+availableQuantity);
	
	System.out.println("CATEGORY           :"+category);
	

	System.out.println("Discount           :"+discountRate);
	
	
}



}