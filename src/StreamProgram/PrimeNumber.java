package StreamProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PrimeNumber {

	public static void main(String[] args) 
	{

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,23,35,42,59));
		
		Stream<Integer> s= list.stream();
		
//		s.filter(Prime::test).forEach(n->System.out.println(n));
		
		s.map(n->n*10).forEach(n->System.out.println(n));
	}

}
class Prime
{
	public static boolean test(Integer t) 
	{
		if(t<2)return false;
		boolean isPrime=true;
		for(int i=2;i<=t/2;i++)
		{
			if(t%i==0)
			{
				isPrime=false;
				break;
			}
		}
				return isPrime;
	}
	
}
//class MyPreticate implements Predicate<Integer>
//{
//
//	@Override
//	public boolean test(Integer t) 
//	{
//		if(t<2)return false;
//		boolean isPrime=true;
//		for(int i=2;i<=t/2;i++)
//		{
//			if(t%i==0)
//			{
//				isPrime=false;
//				break;
//			}
//		}
//				return isPrime;
//	}
//	
//}
