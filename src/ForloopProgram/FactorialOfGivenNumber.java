package ForloopProgram;
import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter number");
		 int num =sc.nextInt();
		 long factorial=1;
		 for (int i = num ;i>=1;i--) {
			 factorial =factorial*i;
		 }
		 
		System.out.println(factorial);
		
		
	}

}
