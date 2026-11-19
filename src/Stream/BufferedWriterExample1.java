package Stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample1 {

	public static void main(String[] args) throws IOException 
	{

		File f= new File("/Users/sujit/StreamCode.txt");
		FileWriter fw = new FileWriter(f,true);
		
		BufferedWriter bw= new BufferedWriter(fw);
		bw.newLine();
		bw.write("Kotti mare muthi");
		bw.close();	
				
	}

}
