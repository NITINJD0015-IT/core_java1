package exception;
import java.io.IOException;


public class Account 
{

	int balance;
	
	public Account() {
	
		 balance=2000;
		
	}
	
	public void withdraw(int amt) throws LowBalanceException, IOException 
	{
		int bal=balance-amt;
		if(bal<1000)
		{
		    LowBalanceException e=new LowBalanceException();
			throw e;
			
		}
		else
		{
			balance=bal;
		throw new IOException();
		}
	}
	
	
	public static void main(String[] args)
	{
	
		Account a=new Account();
		
			try {
				a.withdraw(1500);
			} catch (LowBalanceException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		System.out.println("Balance amount: "+a.balance);
		

	}

}
