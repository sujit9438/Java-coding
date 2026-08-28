package ForloopProgram;

import java.util.Scanner;

public class NumInTheGivebRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter min and max value");
		int min =sc.nextInt();
		int max =sc.nextInt();
		for(int i =min ;i<=max;i++) {
			System.out.println(i);
		}
	}

}
