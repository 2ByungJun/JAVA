import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p10_5 extends JFrame{
	JPanel P;  // �г� ����
	JLabel la; // �� ����
	String SB = "Love Java"; // ���ڿ�
	
	p10_5(){
		// Ÿ��Ʋ ����
		setTitle("+,-Ű�� ��Ʈ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �г� ����, �� ����
		P = new JPanel();
		la = new JLabel(SB); // SB���ڿ� �󺧿� ����
		// �� ��Ʈ
		la.setFont(new Font("Arial",Font.PLAIN,10));
		// Key ��ü ����
		Key K = new Key();
		la.addKeyListener(K);
		
		// ���� �гο� ����
		P.add(la);
		// �г��� ������Ʈ�� ����
		this.add(P);
		this.setSize(300,250);
		this.setVisible(true);
		la.requestFocus(); // Ű �Է� �ޱ����� ��Ŀ�� ����
	}
	
	class Key implements KeyListener{
		public void keyTyped(KeyEvent e) {
		}
		// Ű�� ������ ���
		public void keyPressed(KeyEvent e) {
			// + Ű�� ������ ���
			if( e.getKeyChar() == '+' ) {
				la.setFont(new Font("Arial",Font.PLAIN,la.getFont().getSize()+5));
			}
			// - Ű�� ���� ����� 5���� ���� ���� ���
			if( e.getKeyChar() == '-' && la.getFont().getSize() > 5) {
				la.setFont(new Font("Arial",Font.PLAIN,la.getFont().getSize()-5));
			}
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	public static void main(String[] args) {
		new p10_5();
	}
}
