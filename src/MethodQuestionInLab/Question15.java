package MethodQuestionInLab;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Question15 obj=new Question15();
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(obj.findMin(a,b,c));
	}
	int findMin(int a,int b,int c)
	{
		return (a<b && a<c)?a:(b<c)?b:c;
	}

}
