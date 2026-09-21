package StringProgram;

import java.util.Scanner;

public class FindFirstNotRepecatingCharacter 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		
		
		for(int i=0;i<a.length();i++)
		{
			int count=0;
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("First non-repeated char = "+a.charAt(i));
			}
			else
			{
				System.out.println("There is no non-repeated char");
			}
		}
		
	}

}
