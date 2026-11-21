package StreamProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class firstCode 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		
		Stream<Integer> s= list.stream();
		
		s.forEach(n->System.out.println(n));
		
		
	}
}
