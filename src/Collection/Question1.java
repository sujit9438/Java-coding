package Collection;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Question1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		PerformanceManager pm= new PerformanceManager();
		System.out.println("Enter no. of employees");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter id, name,dept,pscore, bonus : "+i);
			int id=sc.nextInt();
			sc.next();
			String name=sc.next();
			String dept=sc.next();
			double pscore=sc.nextDouble();
			double bonus=sc.nextDouble();
			pm.addEmployee(new Employee32(id, name, dept, pscore), bonus);
			
		}
		pm.displayEmployee();
		pm.highestPerformance();
		pm.lowestPerformance();
		pm.secondHighestPerformance();
		pm.agverageScore();
		pm.highestAnnualBonus();
		
	}

}
class Employee32 implements Comparable<Employee32>
{
	private int employeeId;
	private String employeeName;
	private String dept;
	private double performanceScore;
	public Employee32(int employeeId, String employeeName, String dept, double performanceScore) 
	{	
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dept = dept;
		this.performanceScore = performanceScore;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getDept() {
		return dept;
	}
	public double getPerformanceScore() {
		return performanceScore;
	}
	@Override
	public int compareTo(Employee32 o) 
	{
		if(o.getPerformanceScore()!=this.getPerformanceScore())
			return (int)(o.getPerformanceScore()-this.getPerformanceScore());
		else return this.getEmployeeId()-o.getEmployeeId();
		
	}	
	
}
class PerformanceManager
{
	public TreeMap<Employee32,Double> map = new TreeMap<>();
	public void addEmployee(Employee32 emp ,double bonus)
	{
		map.put(emp, bonus);
	}
	public void displayEmployee()
	{
		for(Employee32 emp : map.keySet())
		{
			System.out.println(emp);
		}
	}
	public void highestPerformance()
	{
		System.out.println("Highest Performance : "+map.firstEntry());
	}
	public void lowestPerformance()
	{
		System.out.println("Lowest Performance : "+map.lastEntry());
	}
	public void agverageScore()
	{
		double sum=0;
		for(Employee32 emp : map.keySet())
		{
			sum+=emp.getPerformanceScore();
		}
		System.out.println("Average Performance : "+(sum/map.size()));
	}
	public void secondHighestPerformance()
	{
//		ArrayList<Map.Entry<Employee32 , Double>> al = new ArrayList<>(map.entrySet());
		System.out.println("Highest Performance : "+map.higherKey(map.firstKey()));
//		System.out.println("Highest performance score : "+al.get(1).getKey());
	}
	public void highestAnnualBonus()
	{
		Employee32 HighestBonceEmployee=null;
		double highestBonus=0;
		for(Map.Entry<Employee32, Double> entry : map.entrySet())
		{
			if(entry.getValue()>highestBonus)
			{
				HighestBonceEmployee=entry.getKey();
				highestBonus=entry.getValue();
			}
		}
		System.out.println("Highest bonus employee : "+HighestBonceEmployee);
	}
	
}
