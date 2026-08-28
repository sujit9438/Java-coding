package MethodQuestionInLab;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Question16 obj=new Question16();
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		obj.printReverse(num);
	}
	void printReverse(int num)
	{
		int temp=num;
		int digit=0;
		while(temp!=0)
		{
			int ld=temp%10;
			digit=digit*10+ld;
			temp/=10;
		}
		System.out.println(digit);
	}

}
