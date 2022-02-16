package lambdaAssignment;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment4Q4 {
	public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
		Predicate<String> out =t->t.length()/2==0;
		employeeList.removeIf(out);
		return employeeList;
	}
	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<>();
		str.add("upendra");
		str.add("gopalarao");
		str.add("pavan");
		Assignment4Q4 assremovdodd = new Assignment4Q4();
		System.out.println(assremovdodd.removeOddLength(str));
	}

}
