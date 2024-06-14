package demo;
import java.util.*;

public class StringTokenizeClass {
	
	public static void main (String []args)
	{
		StringTokenizer s = new StringTokenizer("Vaari is good girl");
				while(s.hasMoreTokens())
				{
					System.out.println("Token : " + s.nextToken());
				}
	}

}
