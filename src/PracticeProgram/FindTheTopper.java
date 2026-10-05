package PracticeProgram;

import java.util.Scanner;

public class FindTheTopper
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student17[] student = new Student17[n];

        for(int i = 0; i < n; i++)
        {
            int rollNo = sc.nextInt();

            String name = sc.next();

            int[] marks = new int[4];

            for(int j = 0; j < 4; j++)
            {
                marks[j] = sc.nextInt();
            }

            student[i] = new Student17(rollNo, name, marks);
        }

        System.out.println("All Students:");

        for(int i = 0; i < student.length; i++)
        {
            student[i].display();
        }

        Student17 topper = student[0];

        for(int i = 1; i < student.length; i++)
        {
            if(student[i].overallAverage() > topper.overallAverage())
            {
                topper = student[i];
            }
        }

        System.out.println();

        System.out.println("Topper (Overall Average):");

        topper.display();

        System.out.printf("Overall Average: %.2f%n", topper.overallAverage());

        sc.close();
    }
}


class Student17
{
    public int rollNo;

    public String name;

    public int[] marks;


    public Student17(int rollNo, String name, int[] marks)
    {
        this.rollNo = rollNo;

        this.name = name;

        this.marks = marks;
    }


    public double overallAverage()
    {
        int sum = 0;

        int count = 0;

        for(int a : marks)
        {
            sum += a;

            count++;
        }

        double avg = (double) sum / count;

        return avg;
    }


    public void display()
    {
        System.out.print(rollNo + " " + name + " ");

        for(int mark : marks)
        {
            System.out.print(mark + " ");
        }

        System.out.printf("(Avg: %.2f)%n", overallAverage());
    }
}