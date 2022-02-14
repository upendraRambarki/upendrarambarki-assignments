import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.OS;
class MinMaxFinderTest {
	MinMaxFinder MM;
	@BeforeEach
	void obj()
	{
		MM= new MinMaxFinder();
	}
	@Test
	@DisplayName("TestCase1")
	void test1() 
	{
		
		int arr[]={56, 34, 7,3, 54, 3, 34, 34, 53};
		int expected[] = {3,56};
		int actual[]=MM.findMinMax(arr);
		Assertions.assertArrayEquals(expected,actual);
//		for(int index=0;index<actual.length;index++)
//		{
//			System.out.print(actual[index]+" ");
//		}
	}
	@Test
	@DisplayName("TestCase2")
	void test2()
	{
		int arr[]={3,3,3,3,3,3};
		int expected[] = {3,3};
		int actual[]=MM.findMinMax(arr);
		Assertions.assertArrayEquals(expected,actual);
	}
	@Test
	@DisplayName("TestCase3")
	void test3()
	{
		int arr[]={25};
		int expected[] = {25,25};
		int actual[]=MM.findMinMax(arr);
		Assertions.assertArrayEquals(expected,actual);
	}
	@Test
	@DisplayName("TestCase4")
	void test4()
	{
		int arr[]={ };
		assertThrows(RuntimeException.class, () -> MM.findMinMax(arr));
		
	}
}
