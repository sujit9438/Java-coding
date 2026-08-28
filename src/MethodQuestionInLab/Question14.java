package MethodQuestionInLab;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Question14 obj=new Question14();
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(obj.isPalindrome(a));
	}
	 public boolean isPalindrome(int num)
	{
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int ld=temp%10;
			sum=sum*10+ld;
			temp/=10;
		}
		if(num==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
