package MethodQuestionInLab;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Question20 a=new Question20();
		System.out.println(a.checkOddEven());
	}
	boolean checkOddEven()
	{
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		if(a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
