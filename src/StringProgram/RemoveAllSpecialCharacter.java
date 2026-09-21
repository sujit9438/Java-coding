package StringProgram;

import java.util.Scanner;

public class RemoveAllSpecialCharacter {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		String result="";
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if((ch>='0' && ch<='9') || (ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			{
				result+=ch;
			}
		}
		System.out.println("Result is : "+result);
	}

}
