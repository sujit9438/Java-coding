package StreamProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,9,7));
		
		Stream<Integer> s= list.stream();
		
		long c=s.filter(n->n%2==0).count();
		System.out.println(c);

	}

}
