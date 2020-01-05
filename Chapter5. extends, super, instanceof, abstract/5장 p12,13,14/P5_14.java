interface Shape {
	final double PI = 3.14;        // ���
	void draw();                   // ������ �׸��� �߻� �޼ҵ�
	double getArea();              // ������ ������ �����ϴ� �߻� �޼ҵ�
	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle implements Shape{
    private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}

	public double getArea() {
		return radius*radius*PI;
	}
}

class Oval implements Shape{
    private int row;
    private int col;
	public Oval(int row, int col) {
		this.row = row;
		this.col = col;
	}
	public void draw() {
		System.out.println(row + "x" + col +  "�� �����ϴ� Ÿ���Դϴ�.");
	}

	public double getArea() {
		return row*col*PI;
	}
}

class Rect implements Shape{
    private int width;
    private int high;
	public Rect(int width, int high) {
		this.width = width;
		this.high = high;
	}
	public void draw() {
		System.out.println(width + "x" + high +  "ũ���� �簢�� �Դϴ�.");
	}

	public double getArea() {
		return width*high;
	}
}

public class P5_14 {
	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++)
			System.out.println("������ " + list[i].getArea());
	}
}
