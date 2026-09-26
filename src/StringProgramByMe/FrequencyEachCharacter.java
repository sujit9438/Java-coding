package StringProgramByMe;

import java.util.Scanner;

public class FrequencyEachCharacter {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String result="";
		for(int i=0;i<a.length();i++)
		{
			
			if(!result.contains(a.charAt(i)+""))
			{
				int count=0;
				for(int j=0;j<a.length();j++)
				{
					if(a.charAt(i)==a.charAt(j))
					{
						count++;
					}
				}
				System.out.println(a.charAt(i)+" "+count);
				result+=a.charAt(i);
				
				
			}
			
		}
	}

}
