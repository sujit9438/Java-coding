package standerdJava;
import java.util.Scanner;
public class pleaseWelcome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		if (age< 25)
		{
			System.out.println("hey young man ,");
		}
		System.out.println("please welcome");
	}

}
