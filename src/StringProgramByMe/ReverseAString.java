package StringProgramByMe;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a= sc.nextLine();
		String result="";
		for(int i=a.length()-1;i>=0;i--)
		{
			char ch=a.charAt(i);
			result+=ch;
		}
		System.out.println("Result is :-"+result);
	}

}
