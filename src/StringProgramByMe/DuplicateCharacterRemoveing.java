package StringProgramByMe;

import java.util.Scanner;

public class DuplicateCharacterRemoveing {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a= sc.nextLine();
		String result="";
		for(int i=0;i<a.length();i++)
		{
			if(!result.contains(a.charAt(i)+""))
			{
				result+=a.charAt(i);
			}
		}
		System.out.println("The Result is : "+result);
	}

}
