import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p10_2 extends JFrame{
	JPanel P; // �г� ����

	public p10_2() {
		// Ÿ��Ʋ ����
		setTitle("�巡���ϴµ��� YELLOW���� GREEN���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �г� ����
		P = new JPanel();
		P.setBackground(Color.GREEN);
		
		// Mouse ��ü ����
		Mouse Mo = new Mouse();
		P.addMouseListener(Mo);
		P.addMouseMotionListener(Mo);
		
		// �г��� ����
		this.add(P);
		this.setSize(300,250);
		this.setVisible(true);
	}
	
	// MouseListener�� MouseMotionListener ����
	class Mouse implements MouseListener,MouseMotionListener {
		// Mouse �巡��
		public void mouseDragged(MouseEvent e) {
			JPanel P = (JPanel)e.getSource();
			P.setBackground(Color.YELLOW);
		}
		// Mouse ���� ���
		public void mousePressed(MouseEvent e) {
			JPanel P = (JPanel)e.getSource();
			P.setBackground(Color.GREEN);
		}
		// Mouse �� ��
		public void mouseReleased(MouseEvent e) {
			JPanel P = (JPanel)e.getSource();
			P.setBackground(Color.GREEN);
		}
		public void mouseMoved(MouseEvent e) {	
		}
		public void mouseEntered(MouseEvent e) {	
		}
		public void mouseExited(MouseEvent e) {	
		}
		public void mouseClicked(MouseEvent e) {	
		}
	}
	
	public static void main(String[] args) {
		new p10_2();
	}
}
