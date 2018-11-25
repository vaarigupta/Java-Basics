package demo;

public class GarbageCollection {
	
	public void finalize()
	{
		System.out.println("G.C");
	}

	public static void main(String[] args) {
		GarbageCollection A = new GarbageCollection();
		GarbageCollection B = new GarbageCollection();
		A = null;
		B = null;
		System.gc();
		
		

	}

}
