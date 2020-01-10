import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class p11_7 extends JFrame{
	JLabel la = new JLabel("I Love Java");
	JSlider s = new JSlider(JSlider.HORIZONTAL,1,100,50); // min=1,max=100,�ʱⰪ 50
	
	public p11_7() {
		setTitle("11�� 7�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); // BorderLayout
		
		// �����̴� ����
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setPaintTrack(true);
		s.setMajorTickSpacing(20); // ū ���� ���� 20
		s.setMinorTickSpacing(5);  // ���� ���� ���� 5
		
		s.addChangeListener(new Change()); 
		
		// �����̳ʿ� ����
		c.add(s,BorderLayout.NORTH);
		c.add(la,BorderLayout.CENTER);
		
		setSize(550,250);
		setVisible(true);
	}
	
	// ChageListener ����
	public class Change implements ChangeListener{
		public void stateChanged(ChangeEvent e){
			{
				int a = s.getValue();
				la.setFont(new Font("Arial",Font.PLAIN,a));
			}
		}
	}

	public static void main(String[] args) {
		new p11_7();
	}
}
