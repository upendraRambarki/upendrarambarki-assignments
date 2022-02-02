
public class StringBufferQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buff = new StringBuffer("StringBuffer ");
		buff.append("is a peer class of String ");
		buff.append("that provides much of ");
		buff.append("the functionality of strings");
		System.out.println(buff);
		
		StringBuffer buff1 = new StringBuffer("It is used to _ at the specified index position");
		
		buff1.replace(14,15,"insert text");
		System.out.println(buff1);
		
		StringBuffer buffrev = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println("before reverse: "+buffrev);
		buffrev.reverse();
		System.out.println("after reverse: "+buffrev);
	}
	

		
		
}
