package SingletonObject;

public class InnerClassDemo {

	public static void main(String[] args) 
	{
		Car.Engine obj=new Car().new Engine(100, 16);
		Car obj2=new Car("Defender",obj);
		System.out.println(obj2);
	}

}
class Car
{
	
	public String name;
	public Engine engine;
	public Car() {}
	public Car(String name, Engine engine)
	{
		this.name=name;
		this.engine=engine;
	}
	public String toString()
	{
		return "Car [name ="+name+" , engine="+engine+"]";
	}
	class Engine
	{
		public int hp;
		public double milage;
		public Engine(int hp, double milage) {
			
			this.hp = hp;
			this.milage = milage;
		}
		public String toString()
		{
			return "Engine [ hp="+hp+" , milage="+milage+" ]";
		}
		
	}
}
