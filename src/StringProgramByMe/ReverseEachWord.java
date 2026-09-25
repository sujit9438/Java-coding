package StringProgramByMe;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String b=IO.readln();
		String [] a=b.split(" ");
		String result="";
		for(int i=0;i<a.length;i++)
		{
			String rev="";
			for(int j=a[i].length()-1;j>=0;j--)
			{
				rev+=a[i].charAt(j);
			}
			result+=rev+" ";
		}
		System.out.println(result.trim());
		
	}

}
