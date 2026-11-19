package Stream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("/Users/sujit/StreamCode.txt");
		int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
	}

}
