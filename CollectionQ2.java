package collections;
import java.util.*;
class products
{
	int Id;
	String productName;
	int price;
	
	
	public products(int Id,String productName,int price)
	{
		this.Id=Id;
		this.productName=productName;
		this.price=price;
	}
	public String toString()
	{
		return "[Id="+Id+",productName="+productName+",price="+price+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id, price, productName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		products other = (products) obj;
		return Id == other.Id && price == other.price && Objects.equals(productName, other.productName);
	}
	
}
public class CollectionQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			products obj = new products(1,"soap",10);
			products obj1 = new products(2,"soap1",11);
			products obj2= new products(3,"soap2",12);
			products obj3= new products(4,"soap3",13);
			products obj4 = new products(5,"soap4",14);
			products obj5 = new products(6,"soap5",15);
			products obj6 = new products(7,"soap6",16);
			products obj7 = new products(8,"soap8",17);
			products obj8 = new products(9,"soap9",18);
			products obj9 = new products(10,"soap11",19);
			products obj10 = new products(10,"soap11",19);
			products obj11 = new products(1,"soap",10);
			HashSet<products> d = new HashSet<products>();
			d.add(obj);
			d.add(obj1);
			d.add(obj2);
			d.add(obj3);
			d.add(obj4);
			d.add(obj5);
			d.add(obj6);
			d.add(obj7);
			d.add(obj8);
			d.add(obj9);
			d.add(obj11);
			d.add(obj10);
			//System.out.println(d);
			Iterator it = d.iterator();
			{
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
			}
			
	}

}
