package inheritenceProgram;

import java.util.Scanner;

//single level

public class Question1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name,age,breed of the dog");
		String name=sc.nextLine();
		int age=sc.nextInt();
		sc.nextLine();
		String breed=sc.next();
		Dog d= new Dog(name, age, breed);
		d.displayDetails();
		d.eat();
		d.bark();
	}

}
class Animal
{
	public String name;
	public int age;
	public Animal(String name, int age) 
	{
		
		this.name = name;
		this.age = age;
	}
	public void displayDetails()
	{
		System.out.println("Nmae :"+name);
		System.out.println("Age :"+age);
	}
	public void eat()
	{
		System.out.println("Eating Food");
	}
}
class Dog extends Animal
{
	public String breed;

	public Dog(String name, int age, String breed) 
	{
		super(name, age);
		this.breed = breed;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Breed :"+breed);
	}
	public  void bark()
	{
		System.out.println("Dog is barking");
	}
}
