package EncapsulationPracticQuestion;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String brand=sc.nextLine();
		String model=sc.nextLine();
		int volume=sc.nextInt();
		int battery=sc.nextInt();
		
		MobilePhone ob=new MobilePhone();
		
		ob.setBrand(brand);
		ob.setModel(model);
		ob.setVolume(volume);
		ob.setBatteryPercentage(battery);
		
		
		System.out.println("Brand : "+ob.getBrand());
		System.out.println("Model : "+ob.getModel());
		System.out.println("Volume : "+ob.getVolume());
		System.out.println("Battery : "+ob.getBatteryPercentage());
	}

}
class MobilePhone
{
	private String brand;
	private String model;
	private int volume;
	private int batteryPercentage;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) 
	{
		if(volume>=0 && volume<=100)
		this.volume = volume;
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	
	
}
