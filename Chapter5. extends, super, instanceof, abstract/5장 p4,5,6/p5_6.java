// 20154010 �̺��� 5�� 6������
class Point {
	private int x,y;
	public Point() { // x,y���� �ʱ�ȭ���� ������ �߰�
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
// Point�� ��ӹ޴� ColorPoint
class ColorPoint extends Point{
	private String color;

	public ColorPoint() {
		super(); // Point()�����ڸ� ����Ŵ
		this.color = "BlACK"; // color ���� <- TELLOW�� �����
	}
	public ColorPoint(int x,int y) {
		super(x,y); // Point(x,y)�����ڸ� ����Ŵ
	}
	public void setXY(int x, int y) { // move �޼ҵ�� x,y�� ����
		move(x,y);
	}
	public String setColor(String color) { // color ���� �� ����
		this.color = color;
		return color;
	}
	public String toString() { // ��� �޼ҵ�
		return setColor(color) + "���� (" + getX() + ","+getY() +")�� ��"; 
	}
}
public class p5_6 {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) ��ġ�� BLACK �� ��.
		System.out.println(zeroPoint.toString()+"�Դϴ�.");
		
		ColorPoint cp = new ColorPoint(10,10); // (10,10) ��ġ�� BLACK �� ��.
		cp.setXY(5,5);      // (5,5)�� x,y �ʱ�ȭ
		cp.setColor("RED"); // RED�� ����
		System.out.println(cp.toString() +"�Դϴ�.");
	}
}
