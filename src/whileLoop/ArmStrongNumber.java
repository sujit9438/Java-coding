package whileLoop;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=num;
		double sum=0;
		while(temp!=0)
		{
			int ld=temp%10;
			double power=(Math.pow(ld, count));
			sum= sum+power;
			temp/=10;
		}
		if(sum==num)
		{
			System.out.println("armstrong number");
		}else {
			System.out.println("not armstrong number");
		}

	}

}
