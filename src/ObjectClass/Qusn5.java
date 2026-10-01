package ObjectClass;

import java.util.Scanner;

public class Qusn5 {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        String Restaurantname=sc.nextLine();
	        String city=sc.nextLine();
	        String orderID=sc.nextLine();
	        double foodamount=sc.nextDouble();
	        double deliveryfee=sc.nextDouble();

	        DeliveryOrder ob=new DeliveryOrder(Restaurantname,city,orderID,foodamount,deliveryfee);

	        System.out.println(ob);
	}

}
class Restaurant
{
    public String restaurantName;
    public String city;
    public Restaurant(String restaurantName,String city)
    {
        this.restaurantName=restaurantName;
        this.city=city;
    }
    public String toString()
    {
        return "Restaurant: "+restaurantName+" City: "+city;
    }
}
class  FoodOrder extends Restaurant
{
    public String orderId;
    public double foodAmount;
    public FoodOrder(String restaurantName,String city ,String orderId,double foodAmount)
    {
        super(restaurantName,city);
        this.orderId=orderId;
        this.foodAmount=foodAmount;
    }
    public String toString()
    {
        return super.toString()+" Order ID: "+orderId+" Food Amount: "+foodAmount;
    }
}
class DeliveryOrder extends FoodOrder
{
    public double deliveryFee;
    public DeliveryOrder(String restaurantName,
              String city,
              String orderId,
              double foodAmount,
              double deliveryFee)
              {
                super(restaurantName,city,orderId,foodAmount);
                this.deliveryFee=deliveryFee;
              }

      public String toString()
      {
        return super.toString()+" Delivery Fee: "+deliveryFee+" Total Amount: "+(foodAmount+deliveryFee);
      }        
}
