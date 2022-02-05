package collections;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
public class collectionQ4 {

	public static void main(String[] args) {
		LinkedList<LocalDate> d=new LinkedList<>();  
		d.add(LocalDate.of(1999, 11, 11));  
		d.add(LocalDate.of(2000,12,23 ));  
		d.add(LocalDate.of(2001, 12, 23));  
		d.add(LocalDate.of(1947, 8, 15));  
	  
		for(LocalDate ld: d)
		{
			if(ld.isLeapYear())
			{
				System.out.println("Your date of birth is "+ld+" and it was leap year");
			}
			else
			{
				System.out.println("Your date of birth is "+ld+" and it was not leap year");
			}
		}
		}
	}



 
		
			
			
			
		