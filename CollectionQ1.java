package collections;
import java.util.TreeMap;
import java.util.*;
import java.util.Set;
class contact
{
	public contact()
	{
		
	}
	long PhoneNumber;
	String Name,Email;
	enum Gender
	{
		male,
		female,
		other;
	}
	public Gender gender;
	public contact(String Name,String Email,Gender gender,long PhoneNumber)
	{
		this.PhoneNumber=PhoneNumber;
		this.Name = Name;
		this.Email=Email;
		this.gender=gender;
	}
	public String toString() {
		return "contact[PhoneNumber="+PhoneNumber+",Name="+Name+",Email="+Email+",gender="+gender+"]"; }
}
public class CollectionQ1 extends contact
{
	public static void main(String[] args) 
	{
		contact obj = new contact("upendra","upendrarambarki@gmail.com",Gender.male,9381490992L);
		contact obj1 = new contact("uppi","uppirambarki@gmail.com",Gender.male,9381490991L);
		contact obj2 = new contact("naveen","naveenrambarki@gmail.com",Gender.male,9381490993L);
		contact obj3 = new contact("laxmi","laxmirambarki@gmail.com",Gender.female,9381490994L);
		contact obj4 = new contact("gopal","gopalrambarki@gmail.com",Gender.male,9381490995L);				
		TreeMap<Long,contact> treemap = new TreeMap<Long,contact>(Collections.reverseOrder());
		treemap.put(obj.PhoneNumber,obj);
		treemap.put(obj1.PhoneNumber,obj1);
		treemap.put(obj2.PhoneNumber,obj2);
		treemap.put(obj3.PhoneNumber,obj3);
		treemap.put(obj4.PhoneNumber,obj4);
		//Set<Map.Entry<Long,contact>> e = treemap.entrySet();
		for (Map.Entry<Long,contact> e : treemap.entrySet()) 
		{
		System.out.println("Keys:"+e.getKey());}
		for (Map.Entry<Long,contact> e : treemap.entrySet()) 
		{
		System.out.println("Valuues"+e.getValue());}
		for (Map.Entry<Long,contact> e : treemap.entrySet()) 
		{	
			System.out.println("Keys:"+e.getKey() + "->"+"values"+ e.getValue());
		}
		
		System.out.println("HashMap");
		HashMap<Long,contact> hashmap = new HashMap<Long,contact>();
		hashmap.put(obj.PhoneNumber,obj);
		hashmap.put(obj1.PhoneNumber,obj1);
		hashmap.put(obj2.PhoneNumber,obj2);
		hashmap.put(obj3.PhoneNumber,obj3);
		hashmap.put(obj4.PhoneNumber,obj4);
		System.out.println(hashmap.size());
		for (Map.Entry<Long,contact> e1 : hashmap.entrySet())
		{
			System.out.println("Keys of hashmap:"+e1.getKey());
		}
		for(Map.Entry<Long, contact> e1:hashmap.entrySet())
		{
			System.out.println("Values of hashMap:"+e1.getValue());
		}
	}
}
