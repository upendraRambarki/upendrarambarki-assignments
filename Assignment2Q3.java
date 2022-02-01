import java.util.ArrayList;
class CurrentAccount extends Assignment2Q3
{
    int totalDeposits = 10000;
    int creditLimit = 2000;
    
    @Override
    public int getCash() {
    	return totalDeposits-creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 
{
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {   	
    	return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
	public int getCash()
	{
		return 0;
	}
	public static void main(String args[])
	{
		Assignment2Q3 obj = new Assignment2Q3();
		
		ArrayList<Integer> cash = new ArrayList<>();
		CurrentAccount CA = new CurrentAccount();
		CA.getCash();
		SavingsAccount SA = new SavingsAccount();
		SA.getCash();
		cash.add(CA.getCash());
		cash.add(SA.getCash());
		System.out.println(obj.totalCashInBank(cash));
	}
	public int totalCashInBank(ArrayList<Integer> cash){
		int sum=0;
		for(int i:cash)
		{
			sum=sum+i;
		}
		return sum;
	}
}
