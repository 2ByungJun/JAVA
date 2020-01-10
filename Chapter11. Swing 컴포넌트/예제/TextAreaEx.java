package file_20154010;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TextAreaEx extends JFrame{
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20);
	
	public TextAreaEx() {
		setTitle("�ؽ�Ʈ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�Է� �� <Enter> Ű�� �Է��ϼ���"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		// �͸� Ŭ���� ���
		tf.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource(); // ���� ����ȯ
			ta.append(t.getText() + "\n");
			t.setText(""); // ���ο� �Է��� �ޱ����� �������� ��ȯ
		}
		});

		setSize(300,300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new TextAreaEx();
	}
}
