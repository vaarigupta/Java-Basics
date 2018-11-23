package demo;

class stop1 extends Thread{
	public void run() {
		for(int i =0;i<5;i++)
		{
			System.out.println("Thread 1 :"+i);
		}
	}

}