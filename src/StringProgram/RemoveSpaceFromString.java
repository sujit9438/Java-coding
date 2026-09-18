package StringProgram;

import java.util.Scanner;

public class RemoveSpaceFromString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String  ");
		String a=sc.nextLine();
		String result="";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ')
			{
				result+=a.charAt(i);
			}
		}
		System.out.println(result);
	}

}
