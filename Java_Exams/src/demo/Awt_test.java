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
       Checkbox c1 = new Checkbox("CSE",null , true);
       Checkbox c2 = new Checkbox("IT",null , false);
       c1.setBounds(200, 200, 100, 30);
       c2.setBounds(200, 250, 100, 30);
       add(c1);
       add(c2);
      // Checkbox group c3 = new CheckboxGroup("Cse");
       
       
       
       
		
	}


	public static void main(String[] args) {
		Awt_test a1 = new Awt_test();
		
		
	}

}
