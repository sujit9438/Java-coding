package StringProgram;

import java.util.Scanner;

public class CheckStringContainsDigitOrNot {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		boolean found=true;
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if((ch>='0' && ch<='9'))
			{
				found=false;
				break;
			}
		}
		if(found)
		{
			System.out.println("Not contains digit");
		}
		else
		{
			System.out.println(" Contains digit ");
		}
	}

}
