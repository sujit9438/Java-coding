package whileLoop;



import java.util.Scanner;

public class HCFOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2= sc.nextInt();
		for(int i=n1;i>=1;i--) {
			 if(n1%i==0 && n2%i==0)
			 {
				 System.out.println("HCF IS : "+i);
				 break;
			 }
		}

	}

}
