package file;

import javax.swing.*;
import java.awt.*;

public class BorderLayout_Ex extends JFrame{
	public BorderLayout_Ex() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // 정보 받기
	
		c.setLayout(new BorderLayout(5,5));
		
		// 버튼 생성 add를 해야 화면에 출력됨
		c.add(new JTextField("텍스트 필드"),BorderLayout.CENTER);
		c.add(new JLabel("라벨 입력 테스트"),BorderLayout.NORTH);
		c.add(new JButton("버튼3"),BorderLayout.SOUTH);
		c.add(new JButton("버튼1"),BorderLayout.EAST);
		c.add(new JButton("버튼2"),BorderLayout.WEST);
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayout_Ex();
	}
}
