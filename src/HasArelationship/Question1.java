package HasArelationship;



public class Question1 {

	public static void main(String[] args) 
	{
		Engine eng=new Engine("petro",1.5);
		car c= new car("honda","black",130,eng);
		c.displayDeatils();
		
	}

}
class car
{
	String company;
	String color;
	double topSpeed;
	Engine engine;
	public car(String company, String color, double topSpeed, Engine engine) {
		super();
		this.company = company;
		this.color = color;
		this.topSpeed = topSpeed;
		this.engine = engine;
	}
	public void displayDeatils()
	{
		System.out.println("Company name: "+company);
		System.out.println("Colour : "+color);
		System.out.println("top speed : "+topSpeed);
		System.out.println("Engine : ");
		engine.displayDeatils();
	}
	
}
class Engine
{
	String fuelType;
	double cc;
	public Engine(String fuelType, double cc) {
		
		this.fuelType = fuelType;
		this.cc = cc;
	}
	public void displayDeatils()
	{
		System.out.println("Fuel Type : "+fuelType);
		System.out.println("Engine capacity :"+cc);
	}
	
}
