
class box{
	double height,width,length;
	box(double l , double w , double h)
	{
		System.out.println("Calculating Volume");
		height = h;
		length=l;
		width=w;
	}
	double volume ()
	{
		return length*width*height;
	}
}
class boxmodel {
	public static void main(String args[])
	{
			box b = new box(6,5,4);
			double volume = b.volume();
			System.out.println(volume);
			
	}
	
}