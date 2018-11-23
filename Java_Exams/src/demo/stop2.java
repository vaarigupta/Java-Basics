package demo;

class stop2 extends Thread{
	public void run() {
		for(int i =0;i<5;i++)
		{
			System.out.println("Thread 2 :"+i);
		}
	}
	

}
