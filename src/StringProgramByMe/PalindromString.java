package StringProgramByMe;

import java.util.Scanner;

public class PalindromString 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String rev="";
		for(int i=0;i<a.length();i++)
		{
			rev=a.charAt(i)+rev;
		}
		if(rev.equals(a))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not palindrom");
		}
	}
}
