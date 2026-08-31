package Interface;

public class Question1 {

	public static void main(String[] args) 
	{
		Device d = new Fan();
		d.turnOn();
		d.turnOff();
		Device d2 = new Light();
		d2.turnOn();
		d2.turnOff();
		Speakar d3 = new Speakar();
		d3.turnOn();
		d3.turnOff();
		d3.connectToWifi();
	}

}
interface Device
{
	void turnOn();
	void turnOff();
	
}
interface BluetootDevices
{
	public abstract void connectToWifi();
}
class Speakar implements  Device ,BluetootDevices
{

	@Override
	public void connectToWifi() 
	{
		System.out.println("Connected to WIFI");
	}

	@Override
	public void turnOn() 
	{
		System.out.println("Speaker turn on");
	}

	@Override
	public void turnOff() 
	{
		System.out.println("Speaker turn off");		
	}
	
}
class Fan implements Device
{

	@Override
public void turnOn() 
	{
		System.out.println("Fan is turned on ");
		
	}

	@Override
	public void turnOff() 
	{
				System.out.println("Fan is turned off");
				System.out.println();
		
	}
	
}
class Light implements Device
{

	@Override
public void turnOn() 
	{
				System.out.println("Light is turned on ");
		
	}

	@Override
	public void turnOff() 
	{
				System.out.println("Light is turned off");
				System.out.println();
		
	}
	
}
