package methodLabQuestion;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printFibonacci(5);
	}
	public static void printFibonacci(int n)
	{
		
		int a=0,b=1,c;
		while(n!=0)
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
			n--;
		}
	}

}
