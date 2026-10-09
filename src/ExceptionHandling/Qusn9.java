package ExceptionHandling;

import java.util.Scanner;

public class Qusn9 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int salary=sc.nextInt();
        int bonus=sc.nextInt();
        Payslip a= new Payslip(salary,bonus);
        try
        {
            a.generatePayslip();
        }
        catch(SalaryCalculationException e)
        {
            System.out.println(e.getMessage());
        }

	}

}
class Payslip
{
    int salary;
    int bonus;
    public Payslip(int salary,int bonus)
    {
        this.salary=salary;
        this.bonus=bonus;
    }
    public void generatePayslip()throws SalaryCalculationException
    {
        if(salary<0)
        {
            throw new SalaryCalculationException("Error: Invalid salary data");
        }
        else
        {
            System.out.println("Payslip generated");
        }
    }
}
class SalaryCalculationException extends Exception
{
    public SalaryCalculationException(String message)
    {
        super(message);
    }
}
