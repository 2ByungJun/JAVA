import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p11_OpenChallenge extends JFrame {
	// SOUTH �г�
	JPanel p = new JPanel();
	// CENTER �̹���
	JLabel imageLabel;
	// �󺧿� center �̹���
	ImageIcon [] image = { new ImageIcon("images/dog1.jpg"),
            new ImageIcon("images/dog2.jpg"),
            new ImageIcon("images/dog3.jpg")};
	// ��ư left, right
	JButton btn_left = new JButton(new ImageIcon("images/left.jpg"));
	JButton btn_right = new JButton(new ImageIcon("images/right.jpg"));
	int image_num = image.length;
	
	public p11_OpenChallenge(){
		setTitle("11�� OpenChallenge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		for(int i=0; i<image.length; i++) {
			imageLabel = new JLabel(image[i]);
		}
		
		btn_left.addActionListener(new LeftAction());
		btn_right.addActionListener(new RightAction());
		
		p.setBackground(Color.GRAY);
		btn_left.setBackground(Color.GRAY);
		btn_right.setBackground(Color.GRAY);
		p.add(btn_left);
		p.add(btn_right);
		
		c.add(imageLabel,BorderLayout.CENTER);
		c.add(p,BorderLayout.SOUTH);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(400,400);
		setVisible(true);
	}
	
	public class LeftAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn_left ) {
				image_num--;
				if(image_num < 0) {
					image_num = 2;
					imageLabel.setIcon(image[image_num]);
				}
				else {
				    imageLabel.setIcon(image[image_num]);
				}
			}
		}
	}
	public class RightAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn_right ) {
				image_num++;
				if(image_num == 3) {
					image_num = 0;
					imageLabel.setIcon(image[image_num]);
				}
				else {
				    imageLabel.setIcon(image[image_num]);
				}
			}
		}
	}

	public static void main(String[] args) {
		new p11_OpenChallenge();
	}
}
