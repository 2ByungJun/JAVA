package file;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // ���� �ޱ�
		
		
		c.setLayout(new BorderLayout(30,20));
		// ��ư ���� add�� �ؾ� ȭ�鿡 ��µ�
		c.add(new JButton("Calculate"),BorderLayout.CENTER);
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("mul"),BorderLayout.EAST);
		c.add(new JButton("div"),BorderLayout.WEST);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
