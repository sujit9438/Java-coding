package MultiThreading;

public class DaemonThread {

	public static void main(String[] args) 
	{
		MyThread33 t = new MyThread33();
		t.setDaemon(true);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main : "+i);
		}
		
		
	}

}
class MyThread33 extends Thread
{
	public void run()
	{
		for(int i=100;i<=1000;i++)
		{
			System.out.println("t thread"+i);
		}
	}
}
