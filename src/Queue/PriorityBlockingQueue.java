package Queue;

import java.util.PriorityQueue;

public class PriorityBlockingQueue 
{
	public static void main(String[] args) throws InterruptedException 
	{
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		Thread producer= new Thread(()->{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Producer adding : "+i);
				pq.add(Integer.valueOf(i));
				try 
				{
					Thread.sleep(2000);	
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		});
		Thread consumer= new Thread(()->{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Consumer adding : "+i);
				pq.remove();
				
			}
			System.out.println("Consumer thread terminated");
		});
		producer.start();
		producer.join();
		consumer.start();
		consumer.join();
		System.out.println(pq);
	}
}

