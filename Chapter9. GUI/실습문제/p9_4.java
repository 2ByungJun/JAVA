package file;

import javax.swing.*;
import java.awt.*;

public class p9_4 extends JFrame{
	public p9_4() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1,7);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		for(int i=0; i<7; i++) {
			JButton comp = new JButton(Integer.toString(i));		
			if( i == 0 )
				comp.setBackground(Color.RED);
			else if( i == 1 )
				comp.setBackground(Color.ORANGE);
			else if( i == 2 )
				comp.setBackground(Color.YELLOW);
			else if( i == 3 )
				comp.setBackground(Color.GREEN);
			else if( i == 4 )
				comp.setBackground(Color.blue);
			else if( i == 5 )
				comp.setBackground(Color.BLACK);
			else if( i == 6 )
				comp.setBackground(Color.magenta);	
			c.add(comp); // ¹öÆ°À» ÄÁÅÙÆ®ÆÒ¿¡ ºÎÂø
		}
		
		setSize(500,300);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new p9_4();
	}

}
