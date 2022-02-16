package lambdaAssignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Assignment4Q2 {

	private int totalPrice;
	private String status;

	public Assignment4Q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {

		ArrayList<Assignment4Q2> filtered_data = orders.stream().filter(p -> p.totalPrice > 10000)
				.filter(p -> p.status.equals("ACCEPTED") || p.status.equals("COMPLETED"))
				.collect(Collectors.toCollection(ArrayList::new));
		return filtered_data;
	}
	public static void main(String[] args) {
		ArrayList<Assignment4Q2> ordersArrayList = new ArrayList<Assignment4Q2>(
				Arrays.asList(new Assignment4Q2(11000, "COMPLETED"), new Assignment4Q2(8000, "COMPLETED"),
						new Assignment4Q2(12000, "ACCEPTED")));
		listOfOrders(ordersArrayList)
				.forEach(Assignment4Q2 -> System.out.println(Assignment4Q2.totalPrice + ": " + Assignment4Q2.status));

	}
}