package MultiThreading;

public class Synchronization 
{
	public static void main(String[] args) 
	{
		Whatsapp wp = new Whatsapp();
		Mythread03 t1= new Mythread03(wp, "Ramesh");
		Mythread03 t2= new Mythread03(wp, "Suresh");
		t1.start();
		t2.start();
		
	}
}
class Mythread03 extends Thread
{
	public Whatsapp wp;
	public String name;
	public Mythread03(Whatsapp wp, String name) 
	{
		this.wp = wp;
		this.name = name;
	}
	public void run()
	{
		wp.sendMessage(name);
	}
	
}
class Whatsapp
{
	public synchronized void sendMessage(String name)
	{
		try {
			for(int i=0;i<=5;i++)
			{
				System.out.println(name+"-> Good Morning ");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
