// 20154010 �̺��� 5�� 5������
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
// Point�� ��ӹ޴� ColorPoint
class ColorPoint extends Point{
	private String color;

	public ColorPoint(int x, int y,String color) {
		super(x, y); // Point(x,y)�����ڸ� ����Ŵ
		this.color = color; // color ���� <- TELLOW�� �����
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

public class p5_5 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"TELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");

	}

}
