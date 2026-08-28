package whileLoop;

import java.util.Scanner;

public class ProductOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int pro=1;
		while(n!=0)
		{
			int ld=n%10;
			pro=pro*ld;
			n=n/10;
		}
		System.out.println(pro);

	}

}
