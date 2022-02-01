

abstract public class Assignment2Q4 {
	int a;
	abstract public int move();

}
abstract class B extends Assignment2Q4
{
	int a;
	public int move()
	{
		return 10;
	}
}
abstract class A
{
	public void m1()
	{
		System.out.println("class abstract without having any abstract method");
	}
	
}
class name extends B
{
	public static void main(String[] args)
	{
		name obj = new name();
		
		System.out.println(obj.move());
	}
}