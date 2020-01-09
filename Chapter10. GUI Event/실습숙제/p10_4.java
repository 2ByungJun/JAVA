import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p10_4 extends JFrame {
	JLabel la; // 라벨
	JPanel P;  // 패널
	String SB = "Love Java"; // 문자열 

	p10_4(){
		// 타이틀 제목
		setTitle("Left키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널 객체, 라벨 객체 생성
		P = new JPanel();
		la = new JLabel(SB);
		// Key 클래스 객체생성
		Key K = new Key();
		// 라벨에 적용
		la.addKeyListener(K);
		
		// 라벨을 패널에 부착
		P.add(la);
		// 패널을 컨포넌트에 부착
		this.add(P);
		this.setSize(300,250);
		this.setVisible(true);
		// 키 입력을 받기위해 포커스등록
		la.requestFocus();
	}
	
	class Key implements KeyListener{
		// 키를 입력할 때
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
