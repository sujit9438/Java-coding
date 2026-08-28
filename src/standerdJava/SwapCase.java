package standerdJava;

import java.util.Scanner;

public class SwapCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = sc.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println((char)(ch+32));
		}
		if(ch>='a'&&ch<='z') {
			System.out.println((char)(ch-32));
		}
	}

}
