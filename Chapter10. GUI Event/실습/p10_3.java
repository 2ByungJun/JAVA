package abcd;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class p10_3 extends JFrame{
	private JLabel la = new JLabel("Love java");
	
	public p10_3() {
		setTitle("Left키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyKeyListener listener = new MyKeyListener();
		c.addKeyListener(listener);
		c.add(la);
		
		setSize(250,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == e.VK_LEFT)
				la.setText("avaJ evoL");
			else
				la.setText("Love Java");
		}
	}
	
	public static void main(String[] args) {
		new p10_3();
	}
}