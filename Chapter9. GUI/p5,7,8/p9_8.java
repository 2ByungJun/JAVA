// 20154010 �̺��� 9�� 8�� ����
import javax.swing.*;
import java.awt.*;

public class p9_8 extends JFrame{
	public p9_8() {
		// Ÿ��Ʋ ����
		setTitle("���� ���� �г��� ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
        c.add(new NorthPanel(),BorderLayout.NORTH); // North �г� �߰�
        c.add(new CenterPanel(),BorderLayout.CENTER); // Center �г� �߰�
        c.add(new SouthPanel(),BorderLayout.SOUTH); // South �г� �߰�
		
		setSize(300,300);
	    setVisible(true);
	}

	public static void main(String[] args) {
		new p9_8();
	}
}

class NorthPanel extends JPanel{ // NORTH�� ���� �г�
    NorthPanel(){	
        setBackground(Color.LIGHT_GRAY);
		this.add(new JButton("����"));
		this.add(new JButton("�ݱ�"));
		this.add(new JButton("������"));
    }
}
class CenterPanel extends JPanel{ // CENTER�� ���� �г�
    CenterPanel(){	
    	this.setLayout(null);
    	for( int i=0; i<10; i++) {
    		JLabel label = new JLabel("*");
        	int x = (int)(Math.random()*200);
         	int y = (int)(Math.random()*150);
         	label.setBackground(Color.RED);
         	label.setLocation(x, y);
         	label.setSize(10, 10);
         	this.add(label);
    	}
    }
}
class SouthPanel extends JPanel{ // SOUTH�� ���� �г�
	SouthPanel(){
        setBackground(Color.yellow);
		this.add(new JButton("Word Input"));
		TextField txt1;
		txt1 = new TextField("",20);
		this.add(txt1);
    }
}