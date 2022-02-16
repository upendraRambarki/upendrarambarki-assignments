package lambdaAssignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment4Q3 {
	 	static void modifyValue(){ 
	 		Product p = new Product();
	 		Consumer<Product> product = P->P.setInt(10);
	 		product.accept(p);
	 		
	 		System.out.println(p.getInt());
	 		Function<Product,Double> f =p1->p.getInt()/2.0;
	 		System.out.println(f.apply(p));
	 	}
	    static class Product { 
	    	private int a;
	    	public int getInt()
	    	{
	    		return a;
	    	}
	    	public void setInt(int a)
	    	{
	    		this.a=a;
	    	}
	    }
	    static void display() { 
	    	Product p2 = new Product();
	    	Supplier<Double> supp= ()->Math.random();
	    	System.out.println(supp.get());
	    	p2.setInt(20);
	    	Predicate<Product> show=p->(p.getInt()>10);
	    	System.out.println(show.test(p2));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4Q3.modifyValue();
		Assignment4Q3.display();
	}

}
