package lambdaAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
		List<String> list2= convertToUpperCase(list);
		System.out.println(list2);
	}
    public static List<String> convertToUpperCase(List<String> list) {
        UnaryOperator<String> op = word -> word.toUpperCase();
        list.replaceAll(op);
        return list;
    }
    

}
