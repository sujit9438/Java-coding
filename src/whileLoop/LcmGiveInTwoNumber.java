package whileLoop;

import java.util.Scanner;

public class LcmGiveInTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for (int i=1;true;i++)
		{
			if((n1*i)%n2==0) {
				System.out.println(n1*i);
				break;
				
			}
		}
		

	}

}
