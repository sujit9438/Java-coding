package StringProgram;

import java.util.Scanner;

public class CountWordInString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String  ");
		String a=sc.nextLine();
//		int count=0;
//		for(int i=0;i<a.length();i++)
//		{
//			if(a.charAt(i)==' ')
//			{
//				count++;
//			}
//		}
//		System.out.println("Count of words = "+(count+1));
		
		String [] b=a.split(" ");
		System.out.println("Count of words : "+b.length);
	}

}
