import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class p11_7 extends JFrame{
	JLabel la = new JLabel("I Love Java");
	JSlider s = new JSlider(JSlider.HORIZONTAL,1,100,50); // min=1,max=100,초기값 50
	
	public p11_7() {
		setTitle("11장 7번 문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); // BorderLayout
		
		// 슬라이더 설정
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setPaintTrack(true);
		s.setMajorTickSpacing(20); // 큰 눈금 간격 20
		s.setMinorTickSpacing(5);  // 작은 눈금 간격 5
		
		s.addChangeListener(new Change()); 
		
		// 컨테이너에 부착
		c.add(s,BorderLayout.NORTH);
		c.add(la,BorderLayout.CENTER);
		
		setSize(550,250);
		setVisible(true);
	}
	
	// ChageListener 구현
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
