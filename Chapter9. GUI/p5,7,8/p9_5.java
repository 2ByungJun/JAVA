// 20154010 이병준 9장 5번 문제
import javax.swing.*;
import java.awt.*;

public class p9_5 extends JFrame {
	public p9_5() {
		// 타이틀 제목
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// GridLayout
		GridLayout grid = new GridLayout(4,4);
		Container c = getContentPane();
		c.setLayout(grid);
		
		// 버튼 생성
		for(int i=0; i<16; i++) {
			JButton comp = new JButton(Integer.toString(i));	
			// 색깔 지정
			if( i == 0 )
				comp.setBackground(Color.RED);
			else if( i == 1 )
				comp.setBackground(Color.ORANGE);
			else if( i == 2 )
				comp.setBackground(Color.YELLOW);
			else if( i == 3 )
				comp.setBackground(Color.GREEN);
			else if( i == 4 )
				comp.setBackground(Color.cyan);
			else if( i == 5 )
				comp.setBackground(Color.BLUE);
			else if( i == 6 )
				comp.setBackground(Color.magenta);	
			else if( i == 7 )
				comp.setBackground(Color.darkGray);
			else if( i == 8 )
				comp.setBackground(Color.PINK);
			else if( i == 9 )
				comp.setBackground(Color.GRAY);
			else if( i == 10 )
				comp.setBackground(Color.WHITE);
			else if( i == 11 )
				comp.setBackground(Color.BLACK);
			else if( i == 12 )
				comp.setBackground(Color.BLACK);
			else if( i == 13 )
				comp.setBackground(Color.ORANGE);
			else if( i == 14 )
				comp.setBackground(Color.BLUE);
			else if( i == 15 )
				comp.setBackground(Color.magenta);
			
			c.add(comp); // 버튼을 컨텐트팬에 부착
		}
		
		setSize(500,300); // 사이즈
		setVisible(true); // 출력
	}
	public static void main(String[] args) {
		new p9_5();
	}
}
