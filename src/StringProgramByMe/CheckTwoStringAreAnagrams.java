package StringProgramByMe;

import java.util.Scanner;

public class CheckTwoStringAreAnagrams {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String a=sc.nextLine();
		
		System.out.println("Enter Second String");
		String b=sc.nextLine();
		
		char [] c= new char[a.length()];
		for(int i=0;i<a.length();i++)
		{
			c[i]=a.charAt(i);
		}
		char [] d= new char[a.length()];
		for(int i=0;i<b.length();i++)
		{
			d[i]=b.charAt(i);
		}
		
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=0;j<c.length-1-i;j++)
			{
				if(c[j]>c[j+1])
				{
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}

		for(int i=0;i<d.length-1;i++)
		{
			for(int j=0;j<d.length-1-i;j++)
			{
				if(d[j]>d[j+1])
				{
					char temp=d[j];
					d[j]=d[j+1];
					d[j+1]=temp;
				}
			}
		}
		String result1="";
		for(int i=0;i<c.length;i++)
		{
			result1+=c[i];
		}
		String result2="";
		for(int i=0;i<d.length;i++)
		{
			result2+=d[i];
		}
		if(result1.equals(result2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}
