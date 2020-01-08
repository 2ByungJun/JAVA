package file;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContendPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); // 정보 받기
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		// 버튼 생성 add를 해야 화면에 출력됨
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
