package inheritenceProgram;
import java.util.Scanner;
public class Question10 
{
	
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        int choice=sc.nextInt();
	        sc.nextLine();
	        String name=sc.nextLine();
	        int rollNumber=sc.nextInt();
	        int mark1=sc.nextInt();
	        int mark2=sc.nextInt();
	        int mark3=sc.nextInt();

	        ScienceStudent ob1= new ScienceStudent(name,rollNumber,mark1,mark2,mark3);

	        ArtStudent ob2=new ArtStudent(name,rollNumber,mark1,mark2,mark3);

	        if (rollNumber <= 0 || mark1 <= 0 ||
	            mark2 <= 0 || mark3 <= 0) {

	            System.out.println("Error Invalid Input");
	            return;
	        }

	        switch(choice)
	        {
	            case 1-> ob1.displayDetails();
	            case 2->ob2.displayDetails();
	        }


	        
	    }
	}
	class Student5
	{
	    protected String name;
	    protected int rollNumber;
	    public Student5(String name,int rollNumber)
	    {
	        this.name=name;
	        this.rollNumber=rollNumber;
	    }
	     public void displayDetails()
	     {
	        System.out.println("Name: "+name);
	        System.out.println("Roll Number: "+rollNumber);
	     }
	      public double calculatePercentage()
	      {
	        return 0.0;
	      }
	}
	class ScienceStudent extends Student5
	{
	     private int physicsMarks; 
	     private int chemistryMarks;
	     private int mathMarks;
	     public ScienceStudent(String name,int rollNumber,int physicsMarks,int chemistryMarks,int mathMarks)
	     {
	        super(name,rollNumber);
	        this.physicsMarks=physicsMarks;
	        this.chemistryMarks=chemistryMarks;
	        this.mathMarks=mathMarks;
	     }
	      public void displayDetails() 
	    {
	        System.out.println("Science Student Details:");
	        super.displayDetails();
	        System.out.println("Physics Marks: "+physicsMarks);
	        System.out.println("Chemistry Marks: "+chemistryMarks);
	        System.out.println("Math Marks: "+mathMarks);
	        System.out.println("Percentage: "+calculatePercentage()+"%");
	    }
	    public double calculatePercentage()
	    {
	        return (physicsMarks+chemistryMarks+mathMarks)/3.0;
	    }
	}
	class ArtStudent extends Student5
	{
	    private int historyMarks;
	    private int geographyMarks;
	    private int englishMarks;
	    public ArtStudent(String name,int rollNumber,int historyMarks,int geographyMarks,int englishMarks)
	    {
	        super(name,rollNumber);
	        this.historyMarks=historyMarks;
	        this.geographyMarks=geographyMarks;
	        this.englishMarks=englishMarks;
	    }
	     public void displayDetails() 
	    {
	        System.out.println("Arts Student Details:");
	        super.displayDetails();
	        System.out.println("History Marks: "+historyMarks);
	        System.out.println("Geography Marks: "+geographyMarks);
	        System.out.println("English Marks: "+englishMarks);
	        System.out.println("Percentage: "+calculatePercentage()+"%");
	    }
	     public double calculatePercentage()
	    {
	        return (historyMarks+geographyMarks+englishMarks)/3.0;
	    }


}
