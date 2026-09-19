package StringProgram;

import java.util.Scanner;

public class ConvertStringToLowerCase {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String a= sc.nextLine();
		String b="";
//		for(int i=0;i<a.length();i++)
//		{
//			char ch=a.charAt(i);
//			if(ch>='A'&&ch<='Z')
//			{
//				ch=(char)(ch+32);
//			}
//			b+=ch;
//		}
		System.out.println(" Result is : "+a.toLowerCase());

	}

}
