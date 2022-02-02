
public class StringQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		System.out.println(str.length());
		
		String str1 ="Hello ";
		String str2 = "How are you";
		System.out.println(str1.concat(str2));
		
		String strQ3 = "“Java String pool refers to collection of Strings which are stored in heap memory";
		String stroriginal= strQ3;
		System.out.println(stroriginal);
		System.out.println("Lower case:"+strQ3.toLowerCase());
		System.out.println("Upper case:"+strQ3.toUpperCase());
		System.out.println(strQ3.replace('a', '$'));
		System.out.println(stroriginal.contains("collection"));
		System.out.println(strQ3);
		String strMatch1="“java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(stroriginal.equals(strMatch1));
		System.out.println(stroriginal.equalsIgnoreCase(strMatch1));
	}

}
