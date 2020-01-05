class Point {
	private int x,y; // 한 점을 구성하는 x,y좌표
	public void set(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}
// Point를 상속받은 ColorPoint 선언
class ColorPoint extends Point {
	private String color; // 점의 색
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint()호출
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); // Point 객체생성
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); // ColorPoint 객체생성
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}
