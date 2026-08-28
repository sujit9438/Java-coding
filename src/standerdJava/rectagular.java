package standerdJava;
import java.util.Scanner;
public class rectagular {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and breadth");
		double len = sc.nextDouble();
		double bre = sc.nextDouble();
		double area = len*bre;
		System.out.printf("area of rectanuglar is %.2f",area);
		}

}
