package arrayProgramClass;

import java.util.Arrays;
import java.util.Scanner;

public class Question43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter values of an Array");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size1 of an Array");
        int size1 = sc.nextInt();

        int[] b = new int[size1];

        System.out.println("Enter values of an Array");

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < b.length; i++) {

            boolean isPresent = false;

            for (int j = 0; j < a.length; j++) {

                if (a[j] == b[i]) {
                    isPresent = true;
                    break;
                }
            }

            if (isPresent == false) {
                count++;
            }
        }

        int[] c = new int[a.length + count];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        int index = a.length;

        for (int i = 0; i < b.length; i++) {

            boolean isPresent = false;

            for (int j = 0; j < a.length; j++) {

                if (a[j] == b[i]) {
                    isPresent = true;
                    break;
                }
            }

            if (isPresent == false) {
                c[index] = b[i];
                index++;
            }
        }

        System.out.println("Result Array: " + Arrays.toString(c));
    }
}