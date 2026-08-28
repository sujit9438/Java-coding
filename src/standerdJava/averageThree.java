package standerdJava;
import java.util.Scanner;

public class averageThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		double avg = (n1+n2+n3)/3.0;
		System.out.printf("average is : %.2f",avg);
		}

}
