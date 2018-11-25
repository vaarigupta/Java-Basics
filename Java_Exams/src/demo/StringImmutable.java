package demo;

public class StringImmutable {

	public static void main(String []args)
	{
		String s = "HELLO";
		String s1 = "HELLO";
		System.out.println(s);
		System.out.println(s1);
		String a = new String("Hello");
		a.concat("WORLD");
		System.out.println("Before assignment  : " + a);
		a = a.concat("WORLD");
		System.out.println("After assignment : " + a);
	}
}
