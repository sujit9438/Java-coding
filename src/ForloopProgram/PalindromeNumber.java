package ForloopProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		 int rev=0;
		 int temp=n;
		 while(temp!=0)
		 {
			 int ld=temp%10;
			 rev=rev*10+ld;
			 temp/=10;
		 }
		 if(n==rev) {
			 System.out.println("Number is palindrome ");

		 }else {
			 System.out.println("Number is not a palindrome ");
			 
		 }
		

	}

}
