package MultiThreading;

public class WaitNotify {

	public static void main(String[] args) throws InterruptedException 
	{
		myThread04 t= new myThread04();
		t.start();
		System.out.println("main thread wait for t thtrad");
		synchronized (t) {
			t.wait();
			
		}
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}

	}

}
class myThread04 extends Thread
{
	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			System.out.println(i);
			if(i==150)
			{
				synchronized (this) {

					System.out.println("t thread notifies the main thread");
					notify();
					
				}
			}
		}
	}
}
