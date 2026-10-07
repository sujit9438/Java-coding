
package ExceptionHandling;

import java.util.Scanner;

public class Qusn2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name,marks one by one");
        String studentName = sc.nextLine();

        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        Student a = new Student(studentName, marks);

        try {

            double average = a.calculateAverage();

            System.out.println("Student: " + a.getStudentName());
            System.out.printf("Average Marks: %.2f%n", average);

        }
        catch (InvalidMarksException e) {

            System.out.println(e.getMessage());

        }
    }
}


class Student {

    private String studentName;
    private int[] marks;

    public Student(String studentName, int[] marks) {
        this.studentName = studentName;
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double calculateAverage() throws InvalidMarksException {

        double sum = 0;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] < 0 || marks[i] > 100) {

                throw new InvalidMarksException("Invalid marks found");
            }

            sum += marks[i];
        }

        double average = sum / 5.0;

        return average;
    }
}


class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}
