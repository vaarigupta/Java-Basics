package demo;
import java.applet.*;
import java.awt.*;

public class applet1 extends Applet{
	
	Image img1;
	public void init()
	{
		img1 = getImage(getDocumentBase(),"main.png");
	}
	public void paint(Graphics g)
	{
		g.drawImage(img1, 100, 100, this);
	}
	
//	public void paint(Graphics g)
//	{
//		g.drawString("hey", 30, 90);
//	}

}
