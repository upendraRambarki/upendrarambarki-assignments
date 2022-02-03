import java.util.*;
public class ExceptionsQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a:");
		int a=sc.nextInt();
		System.out.println("Enter the value b:");
		int b=sc.nextInt();
		float c;
		try
		{
			c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception was:"+e);
			System.out.println("enter new number:");
			int d=sc.nextInt();
			System.out.println(a/d);
		}
		
	}

}
