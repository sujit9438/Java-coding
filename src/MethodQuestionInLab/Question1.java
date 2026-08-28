package MethodQuestionInLab;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(addNumber(a,b));
	}
	public static int addNumber(int a,int b)
	{
		return a+b;
	}

}
