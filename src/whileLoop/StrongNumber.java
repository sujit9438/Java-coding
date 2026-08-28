package whileLoop;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
			int ld=temp%10;
			int f=1;
			for(int i=ld;i>=1;i--)
			{
				f*=i;
			}
			sum=sum+f;
			temp/=10;
		}
		if(sum==n)
		{
			System.out.println("Strong Number");
		}

	}

}
