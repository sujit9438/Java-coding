package PracticeProgram;

import java.util.Scanner;

public class InternationalOnlineExamination 
{
	 public static void main(String[] args) throws CloneNotSupportedException
	    {
	        Scanner sc = new Scanner(System.in);

	        String studentId = sc.nextLine();
	        String studentName = sc.nextLine();

	        int obtainedMarks = sc.nextInt();
	        sc.nextLine();

	        String attemptId = sc.nextLine();
	        String newStudentName = sc.nextLine();

	        int newObtainedMarks = sc.nextInt();

	        StudentInfo a = new StudentInfo(studentId, studentName);

	        ExamResult b = new ExamResult(obtainedMarks);

	        ExamAttempt c = new ExamAttempt(attemptId, a, b);

	        ExamAttempt cloned = (ExamAttempt) c.clone();

	        cloned.studentInfo.studentName = newStudentName;
	        cloned.examResult.obtainedMarks = newObtainedMarks;

	        System.out.println("Original Exam Attempt");
	        System.out.println(c);

	        System.out.println();

	        System.out.println("Cloned Exam Attempt");
	        System.out.println(cloned);
	    }
}
class StudentInfo implements Cloneable
{
    String studentId;
    String studentName;

    StudentInfo(String studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public StudentInfo clone() throws CloneNotSupportedException
    {
        return (StudentInfo) super.clone();
    }

    public String toString()
    {
        return "Student ID: " + studentId +
               "\nStudent Name: " + studentName;
    }
}


class ExamResult implements Cloneable
{
    int obtainedMarks;

    ExamResult(int obtainedMarks)
    {
        this.obtainedMarks = obtainedMarks;
    }

    public ExamResult clone() throws CloneNotSupportedException
    {
        return (ExamResult) super.clone();
    }

    public String toString()
    {
        return "Marks: " + obtainedMarks;
    }
}


class ExamAttempt implements Cloneable
{
    String attemptId;
    StudentInfo studentInfo;
    ExamResult examResult;

    ExamAttempt(String attemptId, StudentInfo studentInfo, ExamResult examResult)
    {
        this.attemptId = attemptId;
        this.studentInfo = studentInfo;
        this.examResult = examResult;
    }

    public ExamAttempt clone() throws CloneNotSupportedException
    {
        ExamAttempt copied = (ExamAttempt) super.clone();

        copied.studentInfo = (StudentInfo) studentInfo.clone();
        copied.examResult = (ExamResult) examResult.clone();

        return copied;
    }

    public String toString()
    {
        return "Attempt ID: " + attemptId +
               "\n" + studentInfo +
               "\n" + examResult;
    }
}

