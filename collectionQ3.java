package collections;

import java.util.TreeSet;
import java.util.*;
class employee implements Comparable<employee>
{
	int Id;
	String Name;
	String Department;
	double Salary;
	
	public employee(int Id,String Name,String Department,double Salary)
	{
		this.Id=Id;
		this.Name=Name;
		this.Department=Department;
		this.Salary=Salary;
	}
	public String toString()
	{
		return "[Id="+Id+",Name="+Name+",Department="+Department+",Salary="+Salary+"]";
	}
	public int compareTo(employee e)
    {
        if (Id >e.Id) {
            return 1;
        }
        else if (Id < e.Id) {
            return -1;
        }
        else {
            return 0;
        }
    }
	
}
public class collectionQ3 {

	public static void main(String[] args) {
		employee e1 = new employee(1,"upendra","developer",30000);
		employee e2= new employee(2,"Naveen","Productbased",40000);
		employee e3 = new employee(3,"gopal","developer",70000);
		employee e4 = new employee(4,"laxmi","RNT",30000);
		employee e5 = new employee(5,"Naveenp","tester",33000);
		employee e6 = new employee(6,"ramarao","business",20000);
		employee e7 = new employee(7,"hemu","developer",27000);
		employee e8 = new employee(8,"vinod","Soft",33000);
		employee e9 = new employee(9,"santu","EEE",20000);
		employee e10 = new employee(10,"santosh","Engineer",20000);
		Scanner sc = new Scanner(System.in);
		System.out.println("a) ID:"+" "+"b) Name:"+" "+"c)Department:"+" "+"d)Salary:");
		System.out.println("Enter your choice:");
		String options = sc.nextLine();
		TreeSet<employee> t = new TreeSet<employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		t.add(e7);
		t.add(e8);
		t.add(e9);
		t.add(e10);
		if (options.equalsIgnoreCase("a"))
		 {
			 for(employee e: t)
			 {
				 System.out.println(e.Id);
			 }
		 }
		 else if (options.equalsIgnoreCase("b"))
		 {
			 for(employee e: t)
			 {
				 System.out.println(e.Name);
			 }
		 }
		 else if (options.equalsIgnoreCase("c"))
		 {
			 for(employee e: t)
			 {
				 System.out.println(e.Department);
			 }
		 }
		 else if (options.equalsIgnoreCase("d"))
		 {
			 for(employee e: t)
			 {
				 System.out.println(e.Salary);
			 }
		 }
		
	}

}
