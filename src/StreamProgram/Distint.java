package StreamProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Distint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,3,6,4,5));
		
		Stream<Integer> s= list.stream();
		s.distinct().forEach(n->System.out.println(n));
		}

}
