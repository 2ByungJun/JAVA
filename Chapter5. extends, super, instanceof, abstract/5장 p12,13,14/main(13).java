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

public class main { // 5�� 13������
	public static void main(String[] args) {
		Shape dount = new Circle(10); // �������� 10�� �� ��ü
		dount.redraw();
		System.out.println("������ "+dount.getArea());
	}

}
