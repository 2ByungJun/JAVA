package file_20154010;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TextAreaEx extends JFrame{
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20);
	
	public TextAreaEx() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		// 익명 클래스 사용
		tf.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource(); // 강제 형변환
			ta.append(t.getText() + "\n");
			t.setText(""); // 새로운 입력을 받기위해 공백으로 전환
		}
		});

		setSize(300,300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new TextAreaEx();
	}
}
