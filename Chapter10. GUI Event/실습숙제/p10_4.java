import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p10_4 extends JFrame {
	JLabel la; // ��
	JPanel P;  // �г�
	String SB = "Love Java"; // ���ڿ� 

	p10_4(){
		// Ÿ��Ʋ ����
		setTitle("LeftŰ�� ���ڿ� �̵�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �г� ��ü, �� ��ü ����
		P = new JPanel();
		la = new JLabel(SB);
		// Key Ŭ���� ��ü����
		Key K = new Key();
		// �󺧿� ����
		la.addKeyListener(K);
		
		// ���� �гο� ����
		P.add(la);
		// �г��� ������Ʈ�� ����
		this.add(P);
		this.setSize(300,250);
		this.setVisible(true);
		// Ű �Է��� �ޱ����� ��Ŀ�����
		la.requestFocus();
	}
	
	class Key implements KeyListener{
		// Ű�� �Է��� ��
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) 
			{
				String StrStart, StrEnd;
				StrStart = SB.substring(1);
				StrEnd = SB.substring(0, 1);
				SB = StrStart + StrEnd;
				la.setText(SB);
			}
		}
		public void keyReleased(KeyEvent e) {	
		}
		public void keyTyped(KeyEvent e) {		
		}
	}
	
	public static void main(String[] args) {
		new p10_4();
	}
}
