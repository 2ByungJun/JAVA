import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p11_2 extends JFrame{
	JComboBox<String> cb = new JComboBox<String>();
	JTextField tf = new JTextField(10);

	public p11_2(){
		setTitle("11�� 2�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �͸� Ŭ������ actionListener�ۼ�
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource(); // t�� ���ڸ� �޾ƿ�
				cb.addItem(t.getText()); // �޾ƿ� ���ڸ� �޺��ڽ��� �߰�
				t.setText(""); // t�� ""�� �ʱ�ȭ
			}
		});
		
		c.add(tf); // �ؽ�Ʈ �ʵ� �߰�
		c.add(cb); // �޺� �ڽ� �߰�
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new p11_2();
	}
}
