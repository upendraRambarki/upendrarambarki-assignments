import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

class bankAccountTest {
	bankAccount b = new bankAccount();
	@Test
	@DisplayName("withdraw")
	void test() 
	{
		int balance=20000;			
				
					try {
						Assertions.assertEquals(18000, b.withdraw(2000));
					} catch (InsufficientFundsExpcetion e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
	}
	@Test
	@DisplayName("test case 2:throwsExpection")
	void testThrows()
	{
		int balance=20000;
		assertThrows(InsufficientFundsExpcetion.class, ()->b.withdraw(22000));
	}
}

