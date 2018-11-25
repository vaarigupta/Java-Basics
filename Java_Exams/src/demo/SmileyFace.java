package demo;
import java.applet.*;
import java.awt.*;

public class SmileyFace extends Applet{
	public void paint(Graphics g)
	{
		//g.setColor(getBackground());
		g.drawOval(100, 100, 200, 200);
		g.fillOval(20, 80, 30, 30);
		g.fillOval(60, 80, 30, 30);
		g.drawLine(40, 80, 40, 50);
		g.drawArc(30, 30, 60, 30, 0, -180);
		
		
		
	}
	

}
