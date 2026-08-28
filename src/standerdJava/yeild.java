package standerdJava;

public class yeild {
	public static void main(String[] args) {
		int a =1;
		String result=switch(a) 
				{
		case 1 ->
		{
			System.out.println("apple");
			System.out.println("mango");
			yield "a";
		}
		case 2->"b";
		case 3->"c";
		default->"enter valid input";
		
		};
		System.out.println(result);
	}

}
