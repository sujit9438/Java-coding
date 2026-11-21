package StreamProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Sorting {

	public static void main(String[] args) 
	{
				
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,5,6,7,8,9));
		
		Stream<Integer> s= list.stream();
		
		s.sorted((o1,o2)->o2-o1).forEach(System.out::println);

	}

}
