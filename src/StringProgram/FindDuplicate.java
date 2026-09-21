package StringProgram;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		String result="";
		System.out.println("Duplicate charcater is : ");
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
				if(!result.contains(""+ch))
				{
					result+=ch;
				}
				else
				{
					System.out.print(ch+" ");
				}
			
		}
		
	}

}
