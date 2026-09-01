package AbstractClass;

public class Question3 {

	public static void main(String[] args) 
	{
		int choice=2;
		double amount=1;
		Payment payment=paymentFactory.getPaymentObject(choice);
		LoanService ls = new LoanService();
		ls.clearLoan(payment, amount);
	}

}
interface Payment
{
	boolean pay(double amount);
}
class UPIPayment implements Payment
{

	@Override
	public boolean pay(double amount) 
	{
		System.out.println("payment of "+amount+" is done using UPI");
				return true;
	}
	
}
class CreditCardPayment implements Payment
{

	@Override
	public boolean pay(double amount) 
	{
		System.out.println("payment of"+amount+"is done using Creditcard");
	
				return true;
	}
	
}
class CryptoPayment implements Payment
{
	public boolean pay(double amount) 
	{
		System.out.println("payment of"+amount+"is done using Crypto Currency");
	
				return true;
	}
	
}
class LoanService
{
	public void clearLoan(Payment payment ,double amount)
	{
		if(payment.pay(amount))
		{
			System.out.println("Loan cleared sucessfully");
			System.out.println("Loan clearance certificate generated");
		}
		else
		{
			System.out.println("Payment failed. Loan not cleared");
		}
	}
}
class paymentFactory
{
	static Payment getPaymentObject(int choice)
	{
		switch(choice)
		{
			case 1-> 
			{return new UPIPayment();
			
			}
			case 2-> {
				return new CreditCardPayment();
			}
			case 3-> {
				return new CryptoPayment();
			}
			default -> {
				return null;
			}
		}
	}
}
