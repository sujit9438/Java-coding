package standerdJava;
import java.util.Scanner;
public class readingStringData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		String name = sc.nextLine();
		System.out.println("Given name is : "+name);
	}

}
