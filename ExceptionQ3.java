import java.util.*;


public class ExceptionQ3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		 long id =2;
		 double balance =1500;
		 System.out.println("Enter the amount:");
		 double amount= sc.nextDouble();
	
		 try
		 {
			 balance=withdraw(balance,amount);
			 System.out.println("Sucessfull transaction done"+balance);
		 }
		 catch(InsufficientBalanceException e1)
		 {
			 System.out.println(e1);
			 
		 }
		 
		 catch(IllegalBankTransactionException e)
		 {
			 System.out.println(e);
		 }
		 {
			 System.out.println("requested amount exceded:");
			 System.out.println("re enter amount:");
			 amount=sc.nextDouble();
			 try {
				balance=withdraw(balance,amount);
			} catch (InsufficientBalanceException | IllegalBankTransactionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 finally {
			 System.out.println(balance);
			 }
			 
		 }{
		 System.out.println("requested amount exceded:");
		 System.out.println("re enter amount:");
		 amount=sc.nextDouble();
		 balance=balance-amount;
		 System.out.println(balance);}
		 
				 
	}
	public static double withdraw(double balance,double amount) throws InsufficientBalanceException,IllegalBankTransactionException
	 {	
		
		Scanner sc1 = new Scanner(System.in);
		 if(balance<amount)
		 {
			 throw new InsufficientBalanceException();
		 }
		 else if(amount<0)
		 {
			 throw new IllegalBankTransactionException();
		 }
		 return balance-amount;		 
	 }
	
}

