package MethodQuestionInLab;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Question17 obj=new Question17();
		Scanner sc = new Scanner(System.in);
		char a= sc.next().charAt(0);
		int b=sc.nextInt();
		obj.printCharacter(a,b);
	}
	void printCharacter(char a, int b)
	{
		for(int i =1;i<=b;i++)
		{
			System.out.print(a);
		}
	}

}
