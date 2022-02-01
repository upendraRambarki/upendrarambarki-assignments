class Rectangle5 extends Shape5 {
    
    String a;
    public String draw() {
    	a="hii rectangle";
    	return a;
    }
}

class Line5 extends Shape5{
    
    String b;
    public String draw() {
    	b="hello Line5";
    	return b;
    }
}

class Cube5 extends Shape5 {
    
    String c;
    public String draw() {
    	return "hey cube5";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube5 obj = new Cube5();
		Line5 obj1 = new Line5();
		Rectangle5 obj2 = new Rectangle5();
		System.out.println(obj2.draw());
		System.out.println(obj1.draw());
		System.out.println(obj.draw());
		
		
	}

}
