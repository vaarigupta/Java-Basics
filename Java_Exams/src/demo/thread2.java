package demo;

public class thread2 implements Runnable {
	public void run()
	{
		System.out.println("hey I'm a Thread 2");
	}
	
	

	public static void main(String[] args) {
		thread2 t2 = new thread2();
		Thread t1 = new Thread(t2);
		t1.start();
		

	}

}
