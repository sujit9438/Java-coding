package standerdJava;

import java.util.Scanner;

public class votingEligibilty {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name :");
	String name = sc.nextLine();
	System.out.println("Enetr your age : ");
	int age = sc.nextInt();
	if(age>=18)
	{
		System.out.println("eligoble for voteing");
		return;
	}
	

	System.out.println("not eligible");
}
}
