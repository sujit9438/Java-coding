package MultiThreading;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException 
	{
		MyRunnable3  r1= new MyRunnable3(Thread.currentThread());
		Thread t1= new Thread(r1);
		t1.start();
		System.out.println("main thread waits for t1 thread to got terminated");
		t1.join();
		for(int i=0;i<=100;i++)
		{
			System.out.println(i);
		}
		System.out.println("Main terminated");
	}

}
class MyRunnable3 implements Runnable
{
	Thread mt;
	public MyRunnable3(Thread mt)
	{
		this.mt=mt;
	}
	
	public void run()
	{
		System.out.println("t1 waits for main thread to got terminated");
		try 
		{
			mt.join();
			for(int i=101;i<=200;i++)
			{
				System.out.println(i);
			}
				System.out.println("t1 got terminated");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
