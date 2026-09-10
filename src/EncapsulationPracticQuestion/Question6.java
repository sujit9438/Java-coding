package EncapsulationPracticQuestion;

public class Question6 {

	public static void main(String[] args) 
	{
		Student7 ob= new Student7();
		ob.setRollNo(101);;
		ob.setName("sujit");
		ob.setAge(22);
		ob.setMarks(105);
		System.out.println("Roll No: "+ob.getRollNo());
		System.out.println("Name : "+ob.getName());
		System.out.println("Age :"+ob.getAge());
		System.out.println("Marks : "+ob.getMarks());

	}

}
class Student7
{
	private int rollNo;
	private String name;
	private int age;
	private double marks;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) 
	{if(rollNo>0)
		this.rollNo = rollNo;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{ 
		
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) 
	{
		if(age>=15 && age<=60)
		this.age = age;
		
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) 
	{
		if(marks>=0&& marks<=100)
		this.marks = marks;
	}
	
	
}
