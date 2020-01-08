// 20154010 �̺��� 9�� 7�� ����

import javax.swing.*;
import java.awt.*;

public class p9_7 extends JFrame{
	public p9_7() {
		// Ÿ��Ʋ ����
		setTitle("���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
        c.add(new NorthPanel(),BorderLayout.NORTH); // North �г� �߰�
        c.add(new CenterPanel(),BorderLayout.CENTER); // Center �г� �߰�
        c.add(new SouthPanel(),BorderLayout.SOUTH); // Center �г� �߰�
        
		setSize(300,250);
	    setVisible(true);
	}

	public static void main(String[] args) {
		new p9_7();
	}

}
class NorthPanel extends JPanel{ // NORTH�� ���� �г�
    NorthPanel(){	
        setBackground(Color.LIGHT_GRAY);
		this.add(new JLabel(" �����Է�"));
		TextField txt1;
		txt1 = new TextField("",20);
		this.add(txt1);
    }
}
class CenterPanel extends JPanel{ // CENTER�� ���� �г�
    CenterPanel(){	
		// ��ư ����
		for(int i=0; i<16; i++) {
			if( i < 10) {
				JButton comp = new JButton(Integer.toString(i));
				comp.setPreferredSize(new Dimension(60,30));
				this.add(comp); // ��ư�� ����Ʈ�ҿ� ����
			}
			else if( i == 10 ) {
				JButton comp = new JButton("CE");
				comp.setPreferredSize(new Dimension(60,30));
				this.add(comp); // ��ư�� ����Ʈ�ҿ� ����
			}
			else if( i == 11 ) {
				JButton comp = new JButton("���");
				comp.setPreferredSize(new Dimension(60,30));
				this.add(comp); // ��ư�� ����Ʈ�ҿ� ����
			}
			else if( i == 12 ) {
				JButton comp = new JButton("+");
				comp.setPreferredSize(new Dimension(60,30));
				comp.setBackground(Color.CYAN);
				this.add(comp); // ��ư�� ����Ʈ�ҿ� ����
			}
			else if( i == 13 ) {
				JButton comp = new JButton("-");
				comp.setPreferredSize(new Dimension(60,30));
				comp.setBackground(Color.CYAN);
				this.add(comp); // ��ư�� ����Ʈ�ҿ� ����
			}
			else if( i == 14 ) {
				JButton comp = new JButton("*");
				comp.setPreferredSize(new Dimension(60,30));
				comp.setBackground(Color.CYAN);
				this.add(comp); // ��ư�� ����Ʈ�ҿ� ����
			}
			else if( i == 15 ) {
				JButton comp = new JButton("/");
				comp.setPreferredSize(new Dimension(60,30));
				comp.setBackground(Color.CYAN);
				this.add(comp); // ��ư�� ����Ʈ�ҿ� ����
			}
		}
				
    }
}
class SouthPanel extends JPanel{ // SOUTH�� ���� �г�
	SouthPanel(){
        setBackground(Color.yellow);
		this.add(new JLabel(" ��� ���"));
		TextField txt1;
		txt1 = new TextField("",20);
		this.add(txt1);
    }
}