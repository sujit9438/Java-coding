package Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException 
	{
//		File a= new File("/Users/sujit/StreamCode.txt");
//		FileWriter d = new FileWriter(a);
		
		FileWriter b = new FileWriter("/Users/sujit/StreamCode.txt");
		
			b.write("sujit mohapatra");
			b.close();
		
			FileWriter c = new FileWriter("/Users/sujit/StreamCode.txt",true);
			c.write("\nmukesh");
			
			c.close();
		
	}

}
