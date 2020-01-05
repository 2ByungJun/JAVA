interface Shape {
	final double PI = 3.14;        // 상수
	void draw();                   // 도형을 그리는 추상 메소드
	double getArea();              // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circle implements Shape{
    private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
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
		System.out.println(row + "x" + col +  "에 내접하는 타원입니다.");
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
		System.out.println(width + "x" + high +  "크기의 사각형 입니다.");
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
			System.out.println("면적은 " + list[i].getArea());
	}
}
