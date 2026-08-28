package standerdJava;
import java.util.Scanner;
public class simpleInterset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal , rate of interset and time of the (year)");
		double p = sc.nextDouble();
		double r = sc.nextDouble();
		double t = sc.nextDouble();
		double inte = (p*t*r)/100;
		System.out.println("interset is :"+inte);
		}

}
