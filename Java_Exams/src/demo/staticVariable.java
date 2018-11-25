package demo;

public class staticVariable {
	static int count = 0;

	public staticVariable() {
		count ++;
		System.out.println("Count : " + count);
		
	}

	public static void main(String[] args) {
		staticVariable s1 = new staticVariable();//1
		staticVariable s2 = new staticVariable();//2
		staticVariable s3 = new staticVariable();//3
	}

}
