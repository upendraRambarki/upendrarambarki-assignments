import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinMaxFindeQ2Test {
	MinMaxFindeQ2 MM1;
	@BeforeEach
	void obj()
	{
		MM1= new MinMaxFindeQ2();
	}
	
	@Test
	void test() {
		MinMaxFindeQ2 expected = new MinMaxFindeQ2();
		MinMaxFindeQ2 actual = new MinMaxFindeQ2();
		int arr[]={56, 34, 7,3, 54, 3, 34, 34, 53};
		expected.maximum=56;
		expected.minimum=3;
		actual=MM1.findMinMax2(arr);
		assertEquals(expected, actual);	
	}

}
