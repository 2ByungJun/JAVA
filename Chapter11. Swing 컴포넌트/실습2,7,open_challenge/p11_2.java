import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p11_2 extends JFrame{
	JComboBox<String> cb = new JComboBox<String>();
	JTextField tf = new JTextField(10);

	public p11_2(){
		setTitle("11장 2번 문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 익명 클래스로 actionListener작성
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource(); // t로 문자를 받아옴
				cb.addItem(t.getText()); // 받아온 문자를 콤보박스에 추가
				t.setText(""); // t를 ""로 초기화
			}
		});
		
		c.add(tf); // 텍스트 필드 추가
		c.add(cb); // 콤보 박스 추가
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new p11_2();
	}
}
