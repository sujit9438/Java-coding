package StreamProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Second {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		
		Stream<Integer> s= list.stream();
		
//		Stream<Integer> s2=s.filter(n->n>20);
//		s2.forEach(System.out::println);
		
		s.filter(n->n>20).forEach(System.out::println);
		
	}

}
