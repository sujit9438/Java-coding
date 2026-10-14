package MultiThreading;

public class DisplayNumberUsingTwoThread {

	public static void main(String[] args) 
	{
		Thread1 t1= new Thread1();
		t1.setName("Thread one");
		Thread2 t2= new Thread2();
		t2.setName("Thread two");
		t1.start();
		t2.start();
	}

}
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=6;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}