package StringProgramByMe;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		String result="";
		for(int i=a.length()-1;i>=0;i--)
		{
			char ch=a.charAt(i);
			result+=ch;
		}
		System.out.println(result);
	}

}
