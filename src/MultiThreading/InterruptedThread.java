package MultiThreading;

public class InterruptedThread 
{
	public static void main(String[] args) 
	{
		Mythread01 t1= new Mythread01();
		t1.start();
		t1.interrupt();
		for(int i=0;i<=100;i++)
		{
			System.out.println(i);
		}			
	}
}
class Mythread01 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=101;i<=200;i++)
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread t1 interruted");
		}
	}
}