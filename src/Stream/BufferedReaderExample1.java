package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample1 {

	public static void main(String[] args) throws IOException 
	{
		File f= new File("/Users/sujit/StreamCode.txt");
		FileReader fw = new FileReader(f);
		
		BufferedReader bw= new BufferedReader(fw);
		String s;
		while((s=bw.readLine())!=null)
		{
			System.out.print(s);
		}
		bw.close();
	}

}
