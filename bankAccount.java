class InsufficientFundsExpcetion extends Exception
{
	
}
public class bankAccount extends InsufficientFundsExpcetion
{
	int amount;
	int balance;
	 public int withdraw(int amount) throws InsufficientFundsExpcetion
	 {
		 if(amount>balance)
		 {
			 throw new InsufficientFundsExpcetion(); 
		 }
		 return balance-amount;
	 }
}
