package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("/Users/sujit/StreamCode.txt");
		String s= "Sujit ";
		byte [] b =s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		
		FileInputStream fis = new FileInputStream("/Users/sujit/StreamCode.txt");
		int ch;
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fis.close();
	}

}
