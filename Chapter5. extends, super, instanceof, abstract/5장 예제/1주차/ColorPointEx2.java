class Point {
	private int x,y; // 한 점을 구성하는 x,y좌표
	public Point() {
		this.x = this.y = 0;
	}
	public Point(int x,int y) {
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
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint()호출
	}
}

public class ColorPointEx2 {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();
	}
}
