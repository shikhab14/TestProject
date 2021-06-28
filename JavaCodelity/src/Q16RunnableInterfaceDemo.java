//WJP to create three threads T1, T2 and T3 and ensure sequence T1,T2,T3 in java

class RunnanbleWorker implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<=3; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " +i);
		}
		
	}

}

public class Q16RunnableInterfaceDemo{
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r = new RunnanbleWorker();
		Thread t1 = new Thread(r);
		t1.start();
		t1.join(); 
		Thread t2 = new Thread(r);
		t2.start();
		t2.join(); 
		Thread t3 = new Thread(r);
		t3.start();
		t3.join(); 
	}
}
