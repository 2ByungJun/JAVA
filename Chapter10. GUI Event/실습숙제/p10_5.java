import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p10_5 extends JFrame{
	JPanel P;  // 패널 변수
	JLabel la; // 라벨 변수
	String SB = "Love Java"; // 문자열
	
	p10_5(){
		// 타이틀 제목
		setTitle("+,-키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널 생성, 라벨 생성
		P = new JPanel();
		la = new JLabel(SB); // SB문자열 라벨에 적용
		// 라벨 폰트
		la.setFont(new Font("Arial",Font.PLAIN,10));
		// Key 객체 생성
		Key K = new Key();
		la.addKeyListener(K);
		
		// 라벨을 패널에 붙임
		P.add(la);
		// 패널을 컴포넌트에 붙임
		this.add(P);
		this.setSize(300,250);
		this.setVisible(true);
		la.requestFocus(); // 키 입력 받기위해 포커스 적용
	}
	
	class Key implements KeyListener{
		public void keyTyped(KeyEvent e) {
		}
		// 키를 눌렀을 경우
		public void keyPressed(KeyEvent e) {
			// + 키를 눌렀을 경우
			if( e.getKeyChar() == '+' ) {
				la.setFont(new Font("Arial",Font.PLAIN,la.getFont().getSize()+5));
			}
			// - 키와 현재 사이즈가 5보다 작지 않을 경우
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
