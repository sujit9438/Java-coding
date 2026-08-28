package PatternDemo;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==6)
				{
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
