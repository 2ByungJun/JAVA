// 20154010 �̺��� 9�� 5�� ����
import javax.swing.*;
import java.awt.*;

public class p9_5 extends JFrame {
	public p9_5() {
		// Ÿ��Ʋ ����
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// GridLayout
		GridLayout grid = new GridLayout(4,4);
		Container c = getContentPane();
		c.setLayout(grid);
		
		// ��ư ����
		for(int i=0; i<16; i++) {
			JButton comp = new JButton(Integer.toString(i));	
			// ���� ����
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
			
			c.add(comp); // ��ư�� ����Ʈ�ҿ� ����
		}
		
		setSize(500,300); // ������
		setVisible(true); // ���
	}
	public static void main(String[] args) {
		new p9_5();
	}
}
