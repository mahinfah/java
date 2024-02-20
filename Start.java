import java.lang.*;
public class Start{
	public static void main(String[] args)
	{
		
		
		
		
		
		StoryBook s1 = new StoryBook("1111111","The Adventures of Huckleberry Finn","Mark Twain",500,50,"Literature");
		
		StoryBook.setDiscountRate(45);
		s1.showDetails();
		StoryBook s2  = new StoryBook();
		s2.setIsbn("234233literature 3");
		s2.setBookTitle("IKIGAI");
		s2.setAuthorName("T.KIYOSAKI");
		s2.setPrice(250);
		s2.setAvaiableQuantity(100);
		s2.setCategory("Self-help book");
		s2.addQuantity(50);
		s2.sellQuantity(100);
		s2.showDetails();
		
		
		TextBook s3 = new TextBook("222222","Biology","Gazi Ajmol",500,50,2);
		
		TextBook.setDiscountRate(20);
		s3.showDetails();
		
		
		TextBook s4  = new TextBook();
		s4.setIsbn("989893");
		s4.setBookTitle("Physics");
		s4.setAuthorName("Shajahan Topon");
		s4.setPrice(250);
		s4.setAvaiableQuantity(1000);
		s4.setStandard(5);
		s4.addQuantity(500);
		s4.sellQuantity(100);
		s4.showDetails();
		
		
		
    }
	            }