package demo;
import java.awt.*;

public class Awt_test extends Frame{

	public Awt_test() {
		Button b = new Button("CLICK RAAVI");
		b.setBounds(100, 100, 100, 30);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
       add(b);
		
	}


	public static void main(String[] args) {
		Awt_test a1 = new Awt_test();
		
		
	}

}
