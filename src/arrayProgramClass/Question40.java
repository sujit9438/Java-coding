package arrayProgramClass;

import java.util.Scanner;

public class Question40 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter values of an Array");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        boolean majorityFound = false;

        for (int i = 0; i < a.length; i++) {

            boolean isPreviouslyPresent = false;
            int count = 0;

            // Check whether this element was already checked
            for (int k = 0; k < i; k++) {
                if (a[k] == a[i]) {
                    isPreviouslyPresent = true;
                    break;
                }
            }

            if (isPreviouslyPresent) {
                continue;
            }

            // Count occurrence
            for (int j = 0; j < a.length; j++) {

                if (a[j] == a[i]) {
                    count++;
                }
            }

            if (count > a.length / 2) {
                System.out.println("Majority element = " + a[i]);
                majorityFound = true;
                break;
            }
        }

        if (!majorityFound) {
            System.out.println("No majority element");
        }
    }
}