package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Question1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue<Patient> queue= new PriorityQueue<>(new PatientPriorityComparator());
		
		System.out.println("Enter Number of Patient");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			 System.out.println("Enter ID , Name , Age , Priority of patient : "+i);
			 
			 int patientId=sc.nextInt();
			 String patientName=sc.next();
			 int age=sc.nextInt();
			 int priority=sc.nextInt();
			 
			 queue.offer(new Patient(patientId, patientName, age, priority));
		}
		System.out.println();
		
		System.out.println("Next Patient"+queue.peek());
		System.out.println();
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.poll());
		}
		
	}
}
class Patient
{
	private int patientId;
	private String patientName;
	private int age;
	private int priority;
	public Patient(int patientId, String patientName, int age, int priority) 
	{
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.priority = priority;
	}
	public int getPatientId() {
		return patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public int getAge() {
		return age;
	}
	public int getPriority() {
		return priority;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", priority="
				+ priority + "]";
	}
	
	
}
class PatientPriorityComparator implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) 
	{
		if(o1.getPriority()!=o2.getPriority())
		{
			return o1.getPriority()-o2.getPriority();
		}
		else if(o1.getAge()!=o2.getAge())
		{
			return o2.getAge()-o1.getAge();
		}
		else
		{
			return o1.getPatientId()-o2.getPatientId();
		}
	}
	
}
