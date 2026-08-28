package whileLoop;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;int pro=1;
		while(n!=0)
		{
			int ld=n%10;
			sum=sum+ld;
			pro=pro*ld;
			n=n/10;
		}
		if(sum==pro) {
			System.out.println("Spy");
		}else {
			System.out.println("not a spy");
		}
	}

}
