// 20154010 이병준 5장 6번문제
class Point {
	private int x,y;
	public Point() { // x,y값을 초기화해줄 생성자 추가
		x = 0;
		y = 0;
	}
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
// Point를 상속받는 ColorPoint
class ColorPoint extends Point{
	private String color;

	public ColorPoint() {
		super(); // Point()생성자를 가리킴
		this.color = "BlACK"; // color 저장 <- TELLOW가 저장됨
	}
	public ColorPoint(int x,int y) {
		super(x,y); // Point(x,y)생성자를 가리킴
	}
	public void setXY(int x, int y) { // move 메소드로 x,y값 세팅
		move(x,y);
	}
	public String setColor(String color) { // color 세팅 후 리턴
		this.color = color;
		return color;
	}
	public String toString() { // 출력 메소드
		return setColor(color) + "색의 (" + getX() + ","+getY() +")의 점"; 
	}
}
public class p5_6 {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점.
		System.out.println(zeroPoint.toString()+"입니다.");
		
		ColorPoint cp = new ColorPoint(10,10); // (10,10) 위치의 BLACK 색 점.
		cp.setXY(5,5);      // (5,5)로 x,y 초기화
		cp.setColor("RED"); // RED로 세팅
		System.out.println(cp.toString() +"입니다.");
	}
}
