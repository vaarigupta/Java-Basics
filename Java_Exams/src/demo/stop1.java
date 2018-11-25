package demo;

class stop1 extends Thread{
	public void run() {
		for(int i =0;i<5;i++)
		{
			try{
				if(i==2)
				{
					sleep(5000);
				}
				
			}
			catch(Exception e)
			{
				
			}
			
			System.out.println("Thread 1 :"+i);
			System.out.println("Exit from thread 1");
		}
	}

}