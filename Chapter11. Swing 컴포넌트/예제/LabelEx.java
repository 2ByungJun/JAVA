import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 문자열 레이블 생성
		JLabel textLabel = new JLabel("사랑합니다.");
		
		// 이미지 레이블 생성
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		// 문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.jpg");
		JLabel label = new JLabel("보고싶으면 전화하세요",normalIcon,SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();
	}
}
