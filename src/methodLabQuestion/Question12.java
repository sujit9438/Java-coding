package methodLabQuestion;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial(5);
	}
	public static void factorial(int a)
	{
		int fac=1;
		for(int i=1;i<=a;i++)
		{
			fac*=i;
		}
		System.out.println(fac);
	}

}
