package MultiThreading;

public class Parctice {

	public static void main(String[] args) 
	{
		
		MyThread1 t=new MyThread1();
		t.start();
		MyThread2 t2=new MyThread2();
		t2.start();
		for(int i=0;i<=100;i++)
		{
			System.out.println(i);
		}
	}

}
class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			System.out.println(i);
		}
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=201;i<=300;i++)
		{
			System.out.println(i);
		}
	}
}

