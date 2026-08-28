package methodLabQuestion;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			checkPrime(7);
	}
	public static void checkPrime(int a)
	{
		int count=1;
		///int temp=a;
		
		for(int i=1;i<=a/2;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}

}
