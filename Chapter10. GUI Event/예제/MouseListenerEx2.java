package abcd;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 객체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,20);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y); // la의 위치를 변경
		}
		//public void mouseReleased(MouseEvent e) {}
		//public void mouseClicked(MouseEvent e) {}
		//public void mouseEntered(MouseEvent e) {}
		//public void mouseExited(MouseEvent e) {}
	}

	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
