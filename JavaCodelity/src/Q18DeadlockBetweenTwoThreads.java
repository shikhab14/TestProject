//What is the cause of deadlock in Java multithreading . Write a java program to create deadlock between two threads.
/*Ans: Deadlock describes a situation where two or more threads are blocked forever, waiting for each other. 
Deadlocks can occur in Java when the synchronized keyword causes the executing thread to block while waiting to get the lock, 
associated with the specified object. 
Since the thread might already hold locks associated with other objects, two threads could each be waiting for the other
to release a lock. In such case, they will end up waiting forever.*/

public class Q18DeadlockBetweenTwoThreads {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
			
	public static void main(String[] args)
	{
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();		
	}
	private static class ThreadDemo1 extends Thread{
		public void run()
		{
			synchronized (Lock1) 
			{
				System.out.println("Therad 1: Holding Lock 1...");
				
				try
				{
					Thread.sleep(10);
				}
				catch(InterruptedException e)
				{
					System.out.println("Thread 1: Waiting for Lock 2....");
					
					synchronized (Lock2) 
					{
						System.out.println("Thread 1: Holding Lock 1 and 2...");
					}
				}
			}
		}
	}
	private static class ThreadDemo2 extends Thread{
		public void run()
		{
			synchronized (Lock2) 
			{
				System.out.println("Therad 2: Holding Lock 2...");
				
				try
				{
					Thread.sleep(10);
				}
				catch(InterruptedException e)
				{
					System.out.println("Thread 2: Waiting for Lock 1....");
					
					synchronized (Lock1) 
					{
						System.out.println("Thread 2: Holding Lock 1 and 2...");
					}
				}
			}
		}
	}
}
