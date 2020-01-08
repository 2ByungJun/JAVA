// 20154010 이병준 9장 7번 문제

import javax.swing.*;
import java.awt.*;

public class p9_7 extends JFrame{
	public p9_7() {
		// 타이틀 제목
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
        c.add(new NorthPanel(),BorderLayout.NORTH); // North 패널 추가
        c.add(new CenterPanel(),BorderLayout.CENTER); // Center 패널 추가
        c.add(new SouthPanel(),BorderLayout.SOUTH); // Center 패널 추가
        
		setSize(300,250);
	    setVisible(true);
	}

	public static void main(String[] args) {
		new p9_7();
	}

}
class NorthPanel extends JPanel{ // NORTH에 붙일 패널
    NorthPanel(){	
        setBackground(Color.LIGHT_GRAY);
		this.add(new JLabel(" 수식입력"));
		TextField txt1;
		txt1 = new TextField("",20);
		this.add(txt1);
    }
}
class CenterPanel extends JPanel{ // CENTER에 붙일 패널
    CenterPanel(){	
		// 버튼 생성
		for(int i=0; i<16; i++) {
			if( i < 10) {
				JButton comp = new JButton(Integer.toString(i));
				comp.setPreferredSize(new Dimension(60,30));
				this.add(comp); // 버튼을 컨텐트팬에 부착
			}
			else if( i == 10 ) {
				JButton comp = new JButton("CE");
				comp.setPreferredSize(new Dimension(60,30));
				this.add(comp); // 버튼을 컨텐트팬에 부착
			}
			else if( i == 11 ) {
				JButton comp = new JButton("계산");
				comp.setPreferredSize(new Dimension(60,30));
				this.add(comp); // 버튼을 컨텐트팬에 부착
			}
			else if( i == 12 ) {
				JButton comp = new JButton("+");
				comp.setPreferredSize(new Dimension(60,30));
				comp.setBackground(Color.CYAN);
				this.add(comp); // 버튼을 컨텐트팬에 부착
			}
			else if( i == 13 ) {
				JButton comp = new JButton("-");
				comp.setPreferredSize(new Dimension(60,30));
				comp.setBackground(Color.CYAN);
				this.add(comp); // 버튼을 컨텐트팬에 부착
			}
			else if( i == 14 ) {
				JButton comp = new JButton("*");
				comp.setPreferredSize(new Dimension(60,30));
				comp.setBackground(Color.CYAN);
				this.add(comp); // 버튼을 컨텐트팬에 부착
			}
			else if( i == 15 ) {
				JButton comp = new JButton("/");
				comp.setPreferredSize(new Dimension(60,30));
				comp.setBackground(Color.CYAN);
				this.add(comp); // 버튼을 컨텐트팬에 부착
			}
		}
				
    }
}
class SouthPanel extends JPanel{ // SOUTH에 붙일 패널
	SouthPanel(){
        setBackground(Color.yellow);
		this.add(new JLabel(" 계산 결과"));
		TextField txt1;
		txt1 = new TextField("",20);
		this.add(txt1);
    }
}