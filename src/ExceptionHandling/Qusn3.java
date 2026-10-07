package ExceptionHandling;

import java.util.Scanner;

public class Qusn3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employeeid, name,password");
		int employeeId=sc.nextInt();
		sc.nextLine();
		String employeeName=sc.next();
		String password=sc.next();
		
		Employee a= new Employee(employeeId, employeeName, password);
		try
		{
			a.registerEmployee();
			
		}
		catch (InvalidPasswordException e) 
		{
			System.err.println(e.getMessage());
		}
		
		
	}

}
class Employee
{
	private int employeeId;
	private String employeeName;
	private String password;
	public Employee(int employeeId, String employeeName, String password) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void registerEmployee() throws InvalidPasswordException
	{
		if(password.length()<8)
		{
			throw new InvalidPasswordException("Password must contain at least 8 character");
		}
		else if(password.equals(password.toLowerCase()))
		{
			throw new InvalidPasswordException("Password must contain an upercase letter");
		}
		else if(!password.contains("0") && !password.contains("1") && !password.contains("2") && 
	             !password.contains("3") && !password.contains("4") && !password.contains("5") && 
	             !password.contains("6") && !password.contains("7") && !password.contains("8") && 
	             !password.contains("9"))
		{
			throw new InvalidPasswordException("Password must cointain digit");
		}
		else
		{
			System.out.println("Employee registraction succesful");
		}
	}
}
class InvalidPasswordException extends Exception
{

	public InvalidPasswordException(String message) {
		super(message);
	}
	
}