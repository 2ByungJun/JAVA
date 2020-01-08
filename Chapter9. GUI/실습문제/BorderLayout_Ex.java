package file;

import javax.swing.*;
import java.awt.*;

public class BorderLayout_Ex extends JFrame{
	public BorderLayout_Ex() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // ���� �ޱ�
	
		c.setLayout(new BorderLayout(5,5));
		
		// ��ư ���� add�� �ؾ� ȭ�鿡 ��µ�
		c.add(new JTextField("�ؽ�Ʈ �ʵ�"),BorderLayout.CENTER);
		c.add(new JLabel("�� �Է� �׽�Ʈ"),BorderLayout.NORTH);
		c.add(new JButton("��ư3"),BorderLayout.SOUTH);
		c.add(new JButton("��ư1"),BorderLayout.EAST);
		c.add(new JButton("��ư2"),BorderLayout.WEST);
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayout_Ex();
	}
}
