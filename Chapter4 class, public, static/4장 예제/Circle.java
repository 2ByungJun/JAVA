
public class Circle {
	int radius;
	String name;
	
	public Circle() {   // �ּ�ó���� ��� ������ �ȵȴ�.
		radius = 1;     // ����Ʈ �����ڸ� �����ָ� �ȵȴ�.
		name = "";
	}
	public Circle(int r,String n) {
		radius = r;
		name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle pizza = new Circle(10,"�ڹ�����");
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle dount = new Circle();
		dount.name = "��������";
		area = dount.getArea();
		System.out.println(dount.name + "�� ������ " + area);

	}

}
