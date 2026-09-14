package ArrayProByMe;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter Array Elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        // Count unique elements
        for (int i = 0; i < a.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                count++;
            }
        }

        int[] b = new int[count];

        int k = 0;

        // Store unique elements
        for (int i = 0; i < a.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                b[k] = a[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates:");
        System.out.println(Arrays.toString(b));
    }
}
