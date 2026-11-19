package Stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {

	public static void main(String[] args) throws IOException {
		
		File b= new File("/Users/sujit/StreamCode.txt");
		FileReader fr = new FileReader("/Users/sujit/StreamCode.txt");
		char [] a= new char[(int)b.length()];
		fr.read(a);
		for(char ch:a)
		{
			System.out.print(ch);
		}
		fr.close();
	}

}