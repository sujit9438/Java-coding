package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		File f= new File("/Users/sujit/Dog.ser");
		
		Dog d1 = new Dog();
		
		FileOutputStream fos = new FileOutputStream("/Users/sujit/Dog.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.close();
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog d2 = (Dog)ois.readObject();
		ois.close();
		System.out.println(d2.i+"--------"+d2.j);
	}

}
class Dog implements Serializable
{
	public int i=10;
	public int j=20;
}