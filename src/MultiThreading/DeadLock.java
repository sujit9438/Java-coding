package MultiThreading;

public class DeadLock 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	MyThread05 t = new MyThread05();
	t.start();
	Thread.sleep(5000);
	System.out.println("main thread wait for t thtrad");
	synchronized (t) {
		t.wait();
		
	}
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
	}
	}

}
class MyThread05 extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println(i);
			if(i==150)
			{
				synchronized (this)
				{
					System.out.println("t thread notify the main thread");
					notify();
				}
			}
		}
	}
}
