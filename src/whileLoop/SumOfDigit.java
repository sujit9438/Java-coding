package whileLoop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int sum=0;
		int ld=n;
		while(n!=0)
		{
			ld=n%10;
			sum=ld+sum;
			n=n/10;
		}
		System.out.println(sum);

	}

}
