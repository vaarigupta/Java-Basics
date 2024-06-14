package demo;

public class isAliveClass extends Thread {
	public void run()
	{
		for(int i =0;i<5;i++)
		{
			System.out.println("Status " + isAlive());
		}
	}
	

	public static void main(String[] args) {
		isAliveClass t1 = new isAliveClass();
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Exit from here");
		

	}

}
