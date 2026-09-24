package StringProgramByMe;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a= sc.next();
		char result='\0';
		boolean isPresent=false;
		for(int i=0;i<a.length();i++)
		{
			int count=0;
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				result=a.charAt(i);
				isPresent=true;
				break;
			}
		}
		if(isPresent)
		{
			System.out.println("First non repeating character is : "+result);
		}
		else
		{
			System.out.println("No non repeating character ");
		}
	}

}
