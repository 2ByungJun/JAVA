import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p10_2 extends JFrame{
	JPanel P; // 패널 변수

	public p10_2() {
		// 타이틀 설정
		setTitle("드래깅하는동안 YELLOW에서 GREEN으로 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널 생성
		P = new JPanel();
		P.setBackground(Color.GREEN);
		
		// Mouse 객체 새성
		Mouse Mo = new Mouse();
		P.addMouseListener(Mo);
		P.addMouseMotionListener(Mo);
		
		// 패널을 붙임
		this.add(P);
		this.setSize(300,250);
		this.setVisible(true);
	}
	
	// MouseListener과 MouseMotionListener 구현
	class Mouse implements MouseListener,MouseMotionListener {
		// Mouse 드래그
		public void mouseDragged(MouseEvent e) {
			JPanel P = (JPanel)e.getSource();
			P.setBackground(Color.YELLOW);
		}
		// Mouse 누를 경우
		public void mousePressed(MouseEvent e) {
			JPanel P = (JPanel)e.getSource();
			P.setBackground(Color.GREEN);
		}
		// Mouse 땔 때
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
