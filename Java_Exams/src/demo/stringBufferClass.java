package demo;

public class stringBufferClass {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Vaari");
		System.out.println("Initial String: " + s1);
		System.out.println("Append : " + s1.append(" is Cute"));
		System.out.println("Insert : " + s1.insert(3, "OMG"));
		System.out.println("Replace : " + s1.replace(1, 4, "jai jai"));
		System.out.println("Delete : " + s1.delete(1, 8));
		System.out.println("Reverse : " + s1.reverse());
		
	
		
		
	}

}
