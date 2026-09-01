package AbstractParticeQuestion;
import java.util.Scanner;

public class Question1 
{
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        int choice = sc.nextInt();

	        switch(choice)
	        {
	            case 1 ->
	            {
	                sc.nextLine();

	                String name = sc.nextLine();
	                double price = sc.nextDouble();
	                sc.nextLine();
	                String category = sc.nextLine();
	                String licenceKey = sc.nextLine();

	                DigitalProduct dp =
	                    new DigitalProduct(name, price, category, licenceKey);

	                double discount = sc.nextDouble();

	                if(discount < 0)
	                {
	                    System.out.println("Error Invalid Input.");
	                    System.exit(0);
	                }

	                dp.displayDeatils();

	                dp.applyDiscount(discount);

	                System.out.println("Tax : " + dp.calculateTax());
	            }

	            case 2 ->
	            {
	                sc.nextLine();

	                String name = sc.nextLine();
	                double price = sc.nextDouble();
	                sc.nextLine();
	                String category = sc.nextLine();
	                double shippingWeight = sc.nextDouble();

	                PhysicalProduct pp =
	                    new PhysicalProduct(name, price, category, shippingWeight);

	                double discount = sc.nextDouble();

	                if(discount < 0)
	                {
	                    System.out.println("Error Invalid Input.");
	                    System.exit(0);
	                }

	                pp.displayDeatils();

	                pp.applyDiscount(discount);

	                System.out.println("Tax : " + pp.calculateTax());

	                System.out.println(
	                    "Shipping Cost : " + pp.calculateShippingCost()
	                );
	            }

	            default ->
	            {
	                System.out.println("Error Invalid Input.");
	            }
	        }

	        sc.close();
	    }
	}


	abstract class Product
	{
	    private String name;
	    private double price;
	    private String category;

	    public Product(String name, double price, String category)
	    {
	        if(name == null || name.isEmpty() ||
	           category == null || category.isEmpty() ||
	           price < 0)
	        {
	            System.out.println("Error Invalid Input.");
	            System.exit(0);
	        }

	        this.name = name;
	        this.price = price;
	        this.category = category;
	    }

	    public abstract void applyDiscount(double percentage);

	    public abstract double calculateTax();


	    public double getPrice()
	    {
	        return price;
	    }

	    public void setPrice(double price)
	    {
	        this.price = price;
	    }

	    public void displayDeatils()
	    {
	        System.out.println("Product Name : " + name);
	        System.out.println("Category : " + category);
	        System.out.println("Price : " + price);
	    }
	}


	class DigitalProduct extends Product
	{
	    private String licenceKey;

	    public DigitalProduct(String name, double price,
	                          String category, String licenceKey)
	    {
	        super(name, price, category);

	        if(licenceKey == null || licenceKey.isEmpty())
	        {
	            System.out.println("Error Invalid Input.");
	            System.exit(0);
	        }

	        this.licenceKey = licenceKey;
	    }

	    @Override
	    public void applyDiscount(double percentage)
	    {
	        double discount = (percentage / 100.0) * getPrice();

	        double newPrice = getPrice() - discount;

	        setPrice(newPrice);

	        System.out.println("Discount : " + discount);
	        System.out.println("New Price : " + getPrice());
	    }

	    @Override
	    public double calculateTax()
	    {
	        return 0.05 * getPrice();
	    }

	    @Override
	    public void displayDeatils()
	    {
	        System.out.println("Digital Product:");

	        super.displayDeatils();

	        System.out.println("License Key : " + licenceKey);
	    }
	}


	class PhysicalProduct extends Product
	{
	    private double shippingWeight;

	    public PhysicalProduct(String name, double price,
	                           String category, double shippingWeight)
	    {
	        super(name, price, category);

	        if(shippingWeight < 0)
	        {
	            System.out.println("Error Invalid Input.");
	            System.exit(0);
	        }

	        this.shippingWeight = shippingWeight;
	    }

	    @Override
	    public void applyDiscount(double percentage)
	    {
	        double discount = (percentage / 100.0) * getPrice();

	        double newPrice = getPrice() - discount;

	        setPrice(newPrice);

	        System.out.println("Discount : " + discount);
	        System.out.println("New Price : " + getPrice());
	    }

	    @Override
	    public double calculateTax()
	    {
	        return 0.08 * getPrice();
	    }

	    public double calculateShippingCost()
	    {
	        return 5 * shippingWeight;
	    }

	    @Override
	    public void displayDeatils()
	    {
	        System.out.println("Physical Product:");

	        super.displayDeatils();

	        System.out.println("Shipping Weight : " + shippingWeight + " KG");
	    }
	

	
}
