package ExceptionHandling;

import java.util.Scanner;

public class Qusn6 {

	public static void main(String[] args) 
	{
		        Scanner sc = new Scanner(System.in);
		        int i = sc.nextInt();
		        
		        try {
		            Thread.sleep(i);
		            System.out.println("Sleeping for " + i + " ms completed.");
		        } 
		        catch (IllegalArgumentException e) {
		            System.out.println("IllegalArgumentException");
		        }
		        catch (InterruptedException e) {
		            System.out.println("InterruptedException caught");
		        }

	}

}
