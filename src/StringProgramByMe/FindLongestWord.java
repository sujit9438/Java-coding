package StringProgramByMe;

import java.util.Scanner;

public class FindLongestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String [] b=a.split(" ");
		
		String longest=b[0];
		for(int i=0;i<b.length;i++)
		{
			if(b[i].length()>longest.length())
			{
				longest=b[i];
			}
		}
		System.out.println("The longest word is: "+longest);
	}

}
