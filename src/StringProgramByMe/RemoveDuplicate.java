package StringProgramByMe;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String rev="";
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(!rev.contains(""+ch))
			{
				rev+=ch;
			}
		}
		System.out.println(rev);
	}

}
