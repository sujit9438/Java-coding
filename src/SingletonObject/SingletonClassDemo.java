package SingletonObject;

public class SingletonClassDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student s1=Student.giveMeObject(10,20);
		System.out.println(s1);

	}

}
class Student
{
	private int i;
	private int j;
	private static Student singletonObject=null;
	public  static Student giveMeObject(int i,int j)
	{
		if(singletonObject==null)
		{
			singletonObject=new Student(i,j);		
		}
		return singletonObject;
	}
	private Student(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return i+"--------"+j;
	}
}
