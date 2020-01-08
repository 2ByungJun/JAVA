package file;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // 정보 받기
		// FlowLayout은 일렬로 정렬되거나 알아서 줄바꿈해서 출력된다.
		// Left : 왼쪽 정렬
		// hGap : 옆 간격
		// Gap  : 높이 간격
		c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		
		// 버튼 생성 add를 해야 화면에 출력됨
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
