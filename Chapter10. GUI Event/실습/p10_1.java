package abcd;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class p10_1 extends JFrame{
	private JLabel la = new JLabel("Love java");
	
	p10_1() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseAdapter listener = new MyMouseAdapter();
		c.addMouseListener(listener);
		c.add(la);
		
		setSize(250,300);
		setVisible(true);
	}

	class MyMouseAdapter extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {
			if(la.getText().equals("Love Java"))
				la.setText("사랑해");
			else
				la.setText("Love Java");
		}
	}
	
	public static void main(String[] args) {
		new p10_1();
	}
}
