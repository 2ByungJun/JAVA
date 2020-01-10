import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p11_1 extends JFrame{
	private JCheckBox [] cb = new JCheckBox[2];
	private String [] names = {"버튼 비활성화","버튼 감추기"};
	private JButton btn = new JButton();
	
	public p11_1() {
		setTitle("CheckBox 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		btn.setText("text button");
		
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<cb.length; i++) {
			cb[i] = new JCheckBox(names[i]);
			cb[i].setBorderPainted(true);
			c.add(cb[i]);
			cb[i].addItemListener(listener);
		}
		
		c.add(btn);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED ) {
				if(e.getItem() == cb[0] )
					btn.setEnabled(false);
				else
					btn.setVisible(false);
			}
			else {
				if(e.getItem() == cb[0] )
					btn.setEnabled(true);
				else
					btn.setVisible(true);	
			}
	    }
	}

	public static void main(String[] args) {
		new p11_1();
	}
}
