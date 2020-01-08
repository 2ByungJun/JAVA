// 20154010 이병준 9장 8번 문제
import javax.swing.*;
import java.awt.*;

public class p9_8 extends JFrame{
	public p9_8() {
		// 타이틀 제목
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
        c.add(new NorthPanel(),BorderLayout.NORTH); // North 패널 추가
        c.add(new CenterPanel(),BorderLayout.CENTER); // Center 패널 추가
        c.add(new SouthPanel(),BorderLayout.SOUTH); // South 패널 추가
		
		setSize(300,300);
	    setVisible(true);
	}

	public static void main(String[] args) {
		new p9_8();
	}
}

class NorthPanel extends JPanel{ // NORTH에 붙일 패널
    NorthPanel(){	
        setBackground(Color.LIGHT_GRAY);
		this.add(new JButton("열기"));
		this.add(new JButton("닫기"));
		this.add(new JButton("나가기"));
    }
}
class CenterPanel extends JPanel{ // CENTER에 붙일 패널
    CenterPanel(){	
    	this.setLayout(null);
    	for( int i=0; i<10; i++) {
    		JLabel label = new JLabel("*");
        	int x = (int)(Math.random()*200);
         	int y = (int)(Math.random()*150);
         	label.setBackground(Color.RED);
         	label.setLocation(x, y);
         	label.setSize(10, 10);
         	this.add(label);
    	}
    }
}
class SouthPanel extends JPanel{ // SOUTH에 붙일 패널
	SouthPanel(){
        setBackground(Color.yellow);
		this.add(new JButton("Word Input"));
		TextField txt1;
		txt1 = new TextField("",20);
		this.add(txt1);
    }
}