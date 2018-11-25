package demo;

public class withoutStatic {
	
	int count = 0;
	withoutStatic()
	{
		count ++;
		System.out.println("Count : " + count);
	}
	

	public static void main(String[] args) {
		withoutStatic c1 = new withoutStatic();
		withoutStatic c2 = new withoutStatic();
		withoutStatic c3 = new withoutStatic();
		
		
		

	}

}
