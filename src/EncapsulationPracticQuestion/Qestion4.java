package EncapsulationPracticQuestion;
import java.util.Scanner;
public class Qestion4 
{
	
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        int employeeNumber=sc.nextInt();
	        sc.nextLine();
	        String employeeName=sc.nextLine();
	        double employeeSalary=sc.nextDouble();
	        Employee ob= new Employee(employeeNumber,employeeName,employeeSalary);

	        double salary=sc.nextDouble();
	        double insalary=salary+ob.getEmployeeSalary();
	        ob.setEmployeeSalary(insalary);
	        ob.getEmployeeDesignation(ob.getEmployeeSalary());

	        System.out.println("Employee Number : "+ob.getEmployeeNumber());
	        System.out.println("Employee Name : "+ob.getEmployeeName());
	        System.out.println("Employee Salary : "+ob.getEmployeeSalary());
	        System.out.println("Employee Designation : "+ob.getEmployeeDesignation(ob.getEmployeeSalary()));

	        
	    }
	}
	class Employee
	{
	    private int employeeNumber;
	    private String employeeName;
	    private double employeeSalary;
	    public Employee(int employeeNumber,String employeeName,double employeeSalary)
	    {
	        this.employeeNumber=employeeNumber;
	        this.employeeName=employeeName;
	        this.employeeSalary=employeeSalary;
	    }
	    public int getEmployeeNumber()
	    {
	        return employeeNumber;
	    }
	    public void setEmployeeNumber(int employeeNumber)
	    {
	        this.employeeNumber=employeeNumber;
	    }
	    public String getEmployeeName()
	    {
	        return employeeName;
	    }
	    public void setEmployeeName(String employeeName)
	    {
	        this.employeeName=employeeName;
	    }
	    public double getEmployeeSalary()
	    {
	        return employeeSalary;
	    }
	    public void setEmployeeSalary(double employeeSalary)
	    {
	        this.employeeSalary=employeeSalary;
	    }
	    public String getEmployeeDesignation(double salary)
	    {
	        if(salary>=120000)
	        {
	            return "HR Manager";
	        }
	        else if(salary >=90000)
	        {
	            return "Devloper";
	        }
	        else if(salary>=60000)
	        {
	            return "Designer";
	        }
	        else
	        {
	            return "Tester";
	        }  
	    }

}
