package demo;
import demo.stop1;
import demo.stop2;

public class threadTest {
	public static void main(String []args)
	{
		stop1 s1 = new stop1();
		stop2 s2 = new stop2();
		s1.start();
		s2.start();
		
	}
	

}
