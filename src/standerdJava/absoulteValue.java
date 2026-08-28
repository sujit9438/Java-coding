package standerdJava;
import java.util.Scanner;
public class absoulteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(num<0)
		{
			num=num*-1;
		}
		System.out.println("Absoulte value :"+num);
	}

}
