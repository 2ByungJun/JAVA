package file;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // ���� �ޱ�
		// FlowLayout�� �Ϸķ� ���ĵǰų� �˾Ƽ� �ٹٲ��ؼ� ��µȴ�.
		// Left : ���� ����
		// hGap : �� ����
		// Gap  : ���� ����
		c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		
		// ��ư ���� add�� �ؾ� ȭ�鿡 ��µ�
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
