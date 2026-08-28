package methodLabQuestion;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfDigit(234);
	}
	public static void sumOfDigit(int a)
	{
		int sum=0;
		int temp=a;
		while(temp>0)
		{
			int ld=temp%10;
			sum=sum+ld;
			temp/=10;
		}
		System.out.println(sum);
	}

}
