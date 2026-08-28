package methodLabQuestion;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumber(243);
	}
	public static void reverseNumber(int a)
	{
		int digit=0;
		int num=a;
		while(num>0) {
			int temp=num%10;
			digit=digit*10+temp;
			num=num/10;
		}
		System.out.println(digit);
	}

}
