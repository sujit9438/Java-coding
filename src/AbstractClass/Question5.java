package AbstractClass;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the message");
		
		String foodItem=sc.nextLine();
		
		
		DeliveryPartner dp=DeliveryFactory.getPartner(choice);
		OrderService os= new OrderService();
		os.placeOrder(dp,foodItem);
	}

}
class OrderService
{
	public void placeOrder(DeliveryPartner partner, String item)
	{
		if(partner.deliveryOrder(item))
		{
			System.out.println("Order delivery sucessfully \nEnjoy your meal");
		}
		else
		{
			System.out.println("Delivery Failed. Try again");
		}
	}
}
class DeliveryFactory
{
	public static DeliveryPartner getPartner(int choice)
	{
		DeliveryPartner dp=null;
		switch(choice)
		{
		case 1-> dp=new SwiggyDelivery();
		case 2-> dp=new ZomatoDelivery();
		case 3-> dp=new DunzoDelivery();
		}
		return dp;
	}
}
interface DeliveryPartner
{
	boolean deliveryOrder(String item);
	
}
class SwiggyDelivery implements DeliveryPartner
{
	public boolean deliveryOrder(String item)
	{
		System.out.println("Delivery is done via Swiggy ");
		return true;
	}
}
class ZomatoDelivery implements DeliveryPartner
{
	public boolean deliveryOrder(String item)
	{
		System.out.println("Delivery is done via Zomato ");
		return true;
	}
}
class DunzoDelivery implements DeliveryPartner
{
	public boolean deliveryOrder(String item)
	{
		System.out.println("Delivery is done via Dunzo ");
		return true;
	}
}
