package lambdaAssignment;
import java.util.*;
@FunctionalInterface
interface arithmeticOperations{
	double operation(int num1,int num2);
}
public class Assignment4Q1 {
	
	public double addition(int num1,int num2)
	{
		arithmeticOperations add=(a,b)->a+b;
		return add.operation(num1, num2);
	}
	public double subtraction(int num1,int num2)
	{
		arithmeticOperations sub=(a,b)->a-b;
		return sub.operation(num1,num2);
	}
	 public double multiplication(int num1,int num2) {
		 arithmeticOperations mul=(a,b)->a*b;
		return mul.operation(num1, num2);
	 }
	 public double division(int num1,int num2)
	 {
	 arithmeticOperations div=(a,b)->{if(b==0)return 0;return a/b;};
	 return div.operation(num1, num2);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		Assignment4Q1 obj = new Assignment4Q1();
		System.out.println(obj.addition(num1,num2));
		System.out.println(obj.subtraction(num1,num2));
		System.out.println(obj.multiplication(num1,num2));
		System.out.println(obj.division(num1,num2));
	}

}
