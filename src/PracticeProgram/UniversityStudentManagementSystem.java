package PracticeProgram;

public class UniversityStudentManagementSystem {

    public static void main(String[] args) {

        // Create 4 students
        Student s1 = new Student(101, "Rahul", "Java", 85);
        Student s2 = new Student(102, "Priya", "Python", 65);
        Student s3 = new Student(103, "Amit", "Java", 65);
        Student s4 = new Student(104, "Sneha", "SQL", 25);

        // Display student details
        System.out.println("----- Student 1 -----");
        s1.displayStudentDetails();

        System.out.println("\n----- Student 2 -----");
        s2.displayStudentDetails();

        System.out.println("\n----- Student 3 -----");
        s3.displayStudentDetails();

        System.out.println("\n----- Student 4 -----");
        s4.displayStudentDetails();

        // Test different marks
        System.out.println("\n----- Grade Calculation -----");
        System.out.println("Rahul Grade: " + s1.calculateGrade());
        System.out.println("Priya Grade: " + s2.calculateGrade());

        // Test same marks
        System.out.println("\n----- Same Marks Test -----");
        System.out.println("Priya Marks: " + s2.getMarks());
        System.out.println("Amit Marks: " + s3.getMarks());

        int result = s2.compareMarks(s3);

        if (result == 1) {
            System.out.println("Priya has higher marks.");
        } 
        else if (result == 0) {
            System.out.println("Both students have equal marks.");
        } 
        else {
            System.out.println("Amit has higher marks.");
        }

        // Test comparison with different marks
        System.out.println("\n----- Different Marks Comparison -----");

        result = s1.compareMarks(s2);

        if (result == 1) {
            System.out.println("Rahul has higher marks.");
        } 
        else if (result == 0) {
            System.out.println("Both students have equal marks.");
        } 
        else {
            System.out.println("Priya has higher marks.");
        }

        // Test invalid marks
        System.out.println("\n----- Invalid Marks Test -----");

        boolean updated = s1.updateMarks(110);

        if (updated) {
            System.out.println("Marks updated successfully.");
        } 
        else {
            System.out.println("Invalid marks. Marks must be between 0 and 100.");
        }

        // Test valid marks update
        System.out.println("\n----- Valid Marks Update -----");

        updated = s1.updateMarks(90);

        if (updated) {
            System.out.println("Marks updated successfully.");
            System.out.println("New Marks: " + s1.getMarks());
        } 
        else {
            System.out.println("Invalid marks.");
        }

        // Test student count
        System.out.println("\n----- Student Count -----");
        System.out.println("Total Students: " + Student.getStudentCount());
    }
}


class Student {

    // Instance variables
    private int studentId;
    private String studentName;
    private String courseName;
    private double marks;

    // Static variables
    private static String collegeName = "BIET";
    private static double passingMarks = 30;
    private static int studentCount = 0;

    // Constructor
    public Student(int studentId, String studentName,
                   String courseName, double marks) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.courseName = courseName;

        // Validate starting marks
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } 
        else {
            this.marks = 0;
            System.out.println("Invalid marks. Marks set to 0.");
        }

        // Increase student count
        studentCount++;
    }

    // Calculate grade
    public char calculateGrade() {

        if (marks >= 80) {
            return 'A';
        } 
        else if (marks >= 60) {
            return 'B';
        } 
        else if (marks >= 40) {
            return 'C';
        } 
        else {
            return 'F';
        }
    }

    // Check whether student passed
    public boolean isPassed() {

        return marks >= passingMarks;
    }

    // Update marks
    public boolean updateMarks(double newMarks) {

        if (newMarks >= 0 && newMarks <= 100) {
            this.marks = newMarks;
            return true;
        } 
        else {
            return false;
        }
    }

    // Compare marks
    /*
     * Returns:
     *  1  -> current student has higher marks
     *  0  -> both students have equal marks
     * -1  -> other student has higher marks
     */
    public int compareMarks(Student otherStudent) {

        if (this.marks > otherStudent.marks) {
            return 1;
        } 
        else if (this.marks == otherStudent.marks) {
            return 0;
        } 
        else {
            return -1;
        }
    }

    // Display student details
    public void displayStudentDetails() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + courseName);
        System.out.println("Marks: " + marks);
        System.out.println("Student Grade: " + calculateGrade());

        if (isPassed()) {
            System.out.println("Result: PASS");
        } 
        else {
            System.out.println("Result: FAIL");
        }

        System.out.println("College Name: " + collegeName);
    }

    // Get marks
    public double getMarks() {
        return marks;
    }

    // Get total student count
    public static int getStudentCount() {
        return studentCount;
    }
}
