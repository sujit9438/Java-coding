package MultiThreading;

public class Practice1 {

	public static void main(String[] args) 
	{
		MyRunnable1 a= new MyRunnable1();
		Thread t=new Thread(a);
		t.start();
		MyRunnable2 b= new MyRunnable2();
		Thread t2=new Thread(b);
		t2.start();
		for(int i=0;i<=100;i++)
		{
			System.out.println(i);
		}
	}

}
class MyRunnable1 implements Runnable
{
	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			System.out.println(i);
		}
	}
}
class MyRunnable2 implements Runnable
{
	public void run()
	{
		for(int i=201;i<=300;i++)
		{
			System.out.println(i);
		}
	}
}
