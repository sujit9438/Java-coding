package StringProgram;

import java.util.Scanner;

public class CheckStringContainsOnlyAlphabet {

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
			System.out.println("String contains only alphabet");
		}
		else
		{
			System.out.println("Not contains only alphabet ");
		}
	}

}
