package ArrayProByMe;

import java.util.Scanner;

public class Question1 {

    private static final int MAX_SIZE = 100;

    // Display array
    public static void display(int[] arr, int n) {

        if (n == 0) {
            System.out.println("\nArray is currently empty.");
            return;
        }

        System.out.print("\nArray elements: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTotal elements: " + n + "/" + MAX_SIZE);
    }

    // Insert element at a specific position
    public static int insertElement(int[] arr, int n, int elem, int pos) {

        // Check overflow
        if (n >= MAX_SIZE) {
            System.out.println(
                    "\nError: Array is full. Cannot insert more elements."
            );
            return n;
        }

        // Check valid position
        if (pos < 0 || pos > n) {
            System.out.println(
                    "\nError: Invalid position. Choose between 0 and " + n + "."
            );
            return n;
        }

        // Shift elements to the right
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert element
        arr[pos] = elem;

        System.out.println(
                "\nSuccessfully inserted " + elem + " at index " + pos + "."
        );

        return n + 1;
    }

    // Delete element from a specific position
    public static int deleteElement(int[] arr, int n, int pos) {

        // Check underflow
        if (n <= 0) {
            System.out.println(
                    "\nError: Array is empty. Nothing to delete."
            );
            return n;
        }

        // Check valid position
        if (pos < 0 || pos >= n) {
            System.out.println(
                    "\nError: Invalid position. Choose between 0 and "
                            + (n - 1) + "."
            );
            return n;
        }

        int removed = arr[pos];

        // Shift elements to the left
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println(
                "\nSuccessfully deleted " + removed + " from index " + pos + "."
        );

        return n - 1;
    }

    // Search element using linear search
    public static int searchElement(int[] arr, int n, int key) {

        for (int i = 0; i < n; i++) {

            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create array with fixed capacity
        int[] arr = new int[MAX_SIZE];

        // Current number of elements
        int n = 0;

        // IMPORTANT: initialize choice
        int choice = 0;

        int elem;
        int pos;
        int key;

        // Initial array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        n = 3;

        do {

            System.out.println("\n==============================");
            System.out.println("     ARRAY OPERATIONS MENU    ");
            System.out.println("==============================");

            System.out.println("1. Display Array");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");

            // Check input
            if (!scanner.hasNextInt()) {

                System.out.println(
                        "\nInvalid input. Please enter a number."
                );

                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {

                // Display
                case 1:

                    display(arr, n);

                    break;

                // Insert
                case 2:

                    System.out.print("Enter element to insert: ");
                    elem = scanner.nextInt();

                    System.out.print(
                            "Enter position index (0 to " + n + "): "
                    );

                    pos = scanner.nextInt();

                    n = insertElement(arr, n, elem, pos);

                    break;

                // Delete
                case 3:

                    if (n == 0) {

                        System.out.println(
                                "\nArray is empty. Nothing to delete."
                        );

                        break;
                    }

                    System.out.print(
                            "Enter position index to delete (0 to "
                                    + (n - 1) + "): "
                    );

                    pos = scanner.nextInt();

                    n = deleteElement(arr, n, pos);

                    break;

                // Search
                case 4:

                    System.out.print("Enter element to search: ");

                    key = scanner.nextInt();

                    pos = searchElement(arr, n, key);

                    if (pos != -1) {

                        System.out.println(
                                "\nElement " + key
                                        + " found at index " + pos + "."
                        );

                    } else {

                        System.out.println(
                                "\nElement " + key
                                        + " is not present in the array."
                        );
                    }

                    break;

                // Exit
                case 5:

                    System.out.println(
                            "\nExiting program. Thank you!"
                    );

                    break;

                // Invalid choice
                default:

                    System.out.println(
                            "\nInvalid choice! Please select an option between 1 and 5."
                    );
            }

        } while (choice != 5);

        scanner.close();
    }
}