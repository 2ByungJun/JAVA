// 20154010 이병준 5장 5번문제
class Point {
	private int x,y;
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

	public ColorPoint(int x, int y,String color) {
		super(x, y); // Point(x,y)생성자를 가리킴
		this.color = color; // color 저장 <- TELLOW가 저장됨
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

public class p5_5 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"TELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");

	}

}
