package AbstractClass;



//template method pattern

public class Question1 {

	public static void main(String[] args) 
	{
		Drink d1= new Tea() ;
		d1.makeDrink();
		Drink d2=new Coffee();
		d2.makeDrink();
			
		
	}

}
abstract class Drink
{
	//template method provide a proper order for method calls
	//template method should be final.
	// why? answer- so that sub-classes won't override.
	
	final void makeDrink() //template-method
	{
		boilWater();
		addMainItem();
		pourIntoCup();
		addExtra();
	}
	public abstract void boilWater();
	public abstract void addMainItem();
	public abstract void pourIntoCup();
	public abstract void addExtra(); 
	
}
class Tea extends Drink
{

	@Override
	public void boilWater() 
	{
		System.out.println("Start boilling  the water");		
	}

	@Override
	public void addMainItem() 
	{
		System.out.println("Adding tea powder");		
	}

	@Override
	public void pourIntoCup() 
	{
			System.out.println("Drink is poured unto cup");	
	}

	@Override
	public void addExtra() 
	{
		System.out.println("Adding sugar");	
		System.out.println();
	}

	
	
}
class Coffee extends Drink
{

	@Override
	public void boilWater() 
	{
		System.out.println("--------------------------");
		System.out.println();
		System.out.println("Start boilling  the water");		
	}

	@Override
	public void addMainItem() 
	{
		System.out.println("Adding coffee powder");		
	}

	@Override
	public void pourIntoCup() 
	{
			System.out.println("Drink is poured unto cup");	
	}

	@Override
	public void addExtra() 
	{
		System.out.println("Adding milk");		
	}

	
	
}
