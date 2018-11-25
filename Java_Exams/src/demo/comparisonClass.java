package demo;

public class comparisonClass {

	public static void main(String[] args) {
		String s1 = "Vaari";
		String s2 = "Vaari";
		String s3 = "Dhruv Sethi";
		String s4 = new String("Vaari");
		System.out.println("using equals() method");
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//true
		
		System.out.println("using == operator ");
		System.out.println(s1==s2); //true
		System.out.println(s1==s3);//false
		System.out.println(s1==s4);//false
		
		System.out.println("using compareTo() method");
		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s3));//6
		System.out.println(s1.compareTo(s4));//0
		
		
		
	}

}
