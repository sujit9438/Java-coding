package inheritenceProgram;

public class First {

	public static void main(String[] args) 
	{
		Addition a=new Addition(10,20);
		
		
		
	}

}
class Calculation
{
	public int x;
	public int y;
}
class Addition extends Calculation
{
	
	public Addition(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public void getSum()
	{
		System.out.println(x+y);
	}
	
}
class Subtraction extends Calculation
{
	
	public Subtraction(int x, int y) 
	{
		
		this.x = x;
		this.y = y;
	}
	public void getSub()
	{
		System.out.println(x-y);
	}
	
}
class Multipication extends Calculation
{
	
	public Multipication(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public void getProduct()
	{
		System.out.println(x*y);
	}
	
}
class Division extends Calculation
{
	public Division(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	public void getDiv()
	{
		System.out.println(x/y);
	}
	
}
class Reminder extends Calculation
{
	
	public Reminder(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	public void getRem()
	{
		System.out.println(x%y);
	}
	
}


