
import java.util.Calendar;
import java.util.GregorianCalendar;

 public class Painting {
	
	
			//private variables
			private String artistName;
			private String name;
			private double price;
			private int year;
			
			//default constructor
			public Painting() {
				
			}
			//non-default constructor
			public Painting(String artistName, String name, double price, int year) {
				this.artistName = artistName;
				this.name = name;
				this.price = price;
				this.year = year;
				
			}
			
			//setters and getters
			public String getartistName() {
				return artistName;
			}
			public String getname() {
				return name;
			}
			public double getprice() {
				return price;
			}
			public int getyear() {
				return year;
			}
			public void setartistName(String artistName) {
				this.artistName = artistName;
			}
			public void setname(String name) {
				this.name = name;
			}
			public void setprice(double price) {
				this.price = price;
			}
			public void setyear(int year) {
				this.year = year;
			}
			public double getMinimumDiscountPrice(){
				return this.price*(1-.15);
			}
			public double getMaximumDiscountPrice(){
				return this.price*(1-.10);
			}
			public int getAge(){
				GregorianCalendar date = new GregorianCalendar();
				return (this.year - date.get(Calendar.YEAR));
				
			}
			
 }		
		
	
