class box{
	double width , height , length;

}
class boxModel
{
	public static void main(String args[])
	{
		box mybox = new box();
	double volume;
	mybox.width = 10;
	mybox.height =12;
	mybox.length = 100;
	volume = 	mybox.width *mybox.height*mybox.length;
	System.out.println(volume);
	}
}