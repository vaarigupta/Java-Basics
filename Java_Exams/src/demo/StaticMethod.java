package demo;

public class StaticMethod {
	int i =0;
	static String s = "Vaari";
	public  StaticMethod() {
		
	}
	static void update ()
	{
		System.out.println("Length of "+ s + ": " + s.length());
		//System.out.println(i);
	}
	void display()
	{
		System.out.println("Initialized i with "+ i + s );
	}
	public static void main(String[] args) {
		update();
		StaticMethod s1 = new StaticMethod();
		s1.display();
	}
}
