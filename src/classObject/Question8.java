package classObject;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Detalies");
		String n=sc.nextLine();
		int b=sc.nextInt();
		sc.nextLine();
		String c=sc.nextLine();
		Patient a= new Patient(n,b,c);
		a.displayPatientInfo();
	}

}
class Patient
{
	public String name;
	public int age;
	public String disease;
	public Patient(String name, int age, String disease) {
		
		this.name = name;
		this.age = age;
		this.disease = disease;
		
	}
	void checkCritical()
	{
		if(age>60)
		{
			System.out.println("High Risk Patient");
		}
		else
		{
			System.out.println("Low Risk Patient");
		}
	}
	void displayPatientInfo()
	{
		System.out.println("Patient Name : "+name);
		System.out.println("Patient Age : "+age);
		checkCritical();
	}
	
}
