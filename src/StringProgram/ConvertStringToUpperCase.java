package StringProgram;

import java.util.Scanner;

import standerdJava.readingStringData;

public class ConvertStringToUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String  ");
		String a=sc.nextLine();
//		String b="";
//		for(int i=0;i<a.length();i++)
//		{
//			char ch=a.charAt(i);
//			if(ch>='a'&&ch<='z')
//			{
//				ch=(char)(ch-32);
//			}
//			b+=ch;
//		}
//		System.out.println("Result = "+b);
		
		
		
		System.out.println("Result = "+a.toUpperCase());
		
	}

}
