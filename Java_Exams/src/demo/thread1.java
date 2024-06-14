package demo;

public class thread1 extends Thread {
	
	public void run() {
		System.out.println("Thread 1");
	}

	public static void main(String[] args) {
		
		thread1 t1 = new thread1();
		t1.start();

	}

}
