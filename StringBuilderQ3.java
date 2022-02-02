
public class StringBuilderQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder("StringBuffer ");
		builder.append("is a peer class of String ");
		builder.append("that provides much of ");
		builder.append("the functionality of strings");
		System.out.println(builder);
		
		StringBuilder builder1 = new StringBuilder("It is used to _ at the specified index position");
		
		builder1.replace(14,15,"insert text");
		System.out.println(builder1);
		StringBuilder builderrev = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println("before reverse: "+builderrev);
		builderrev.reverse();
		System.out.println("after reverse: "+builderrev);
	
	}

}
