package EncapsulationPracticQuestion;
import java.util.Scanner;
public class Question3 
{
	
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        // Taking initial input
	        String itemName = sc.nextLine();
	        double pricePerUnit = sc.nextDouble();
	        int quantityInStock = sc.nextInt();

	        // Creating object
	        InventoryItem ob = new InventoryItem(
	                itemName, pricePerUnit, quantityInStock);

	        // Display initial details
	        System.out.println("Item Name       : " + ob.getItemName());
	        System.out.println("Price Per Unit  : " + ob.getPricePerUnit());
	        System.out.println("Quantity        : " + ob.getQuantityInStock());
	        System.out.println("Total Value     : " + ob.calculateTotalValue());

	        System.out.println();

	        // Ask whether user wants to update
	       

	        int choice = sc.nextInt();

	        // If user selects No
	        if (choice == 2)
	        {
	            System.exit(0);
	        }

	        // If user selects Yes
	        if (choice == 1)
	        {
	           

	            int updateChoice = sc.nextInt();

	            // Update Price
	            if (updateChoice == 1)
	            {
	               
	                double newPrice = sc.nextDouble();

	                ob.setPricePerUnit(newPrice);
	            }

	            // Update Quantity
	            else if (updateChoice == 2)
	            {
	               // System.out.println("Enter New Quantity");
	                int newQuantity = sc.nextInt();

	                ob.setQuantityInStock(newQuantity);
	            }

	            // Display updated details
	            System.out.println();
	            System.out.println("After Update:");
	            System.out.println();

	            System.out.println("Item Name       : " + ob.getItemName());
	            System.out.println("Price Per Unit  : " + ob.getPricePerUnit());
	            System.out.println("Quantity        : " + ob.getQuantityInStock());
	            System.out.println("Total Value     : " + ob.calculateTotalValue());
	        }

	        sc.close();
	    }
	}


	class InventoryItem
	{
	    // Private variables
	    private String itemName;
	    private double pricePerUnit;
	    private int quantityInStock;

	    // Parameterized Constructor
	    public InventoryItem(String itemName, double pricePerUnit, int quantityInStock)
	    {
	        this.itemName = itemName;
	        this.pricePerUnit = pricePerUnit;
	        this.quantityInStock = quantityInStock;
	    }

	    // Getter for itemName
	    public String getItemName()
	    {
	        return itemName;
	    }

	    // Setter for itemName
	    public void setItemName(String itemName)
	    {
	        this.itemName = itemName;
	    }

	    // Getter for pricePerUnit
	    public double getPricePerUnit()
	    {
	        return pricePerUnit;
	    }

	    // Setter for pricePerUnit
	    public void setPricePerUnit(double pricePerUnit)
	    {
	        this.pricePerUnit = pricePerUnit;
	    }

	    // Getter for quantityInStock
	    public int getQuantityInStock()
	    {
	        return quantityInStock;
	    }

	    // Setter for quantityInStock
	    public void setQuantityInStock(int quantityInStock)
	    {
	        this.quantityInStock = quantityInStock;
	    }

	    // Calculate total value
	    public double calculateTotalValue()
	    {
	        return pricePerUnit * quantityInStock;
	    }
	
}
