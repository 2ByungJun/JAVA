
public class Circle2 {
	int radius;
	double getArea( ) { return 3.14*radius*radius; }
	
	public Circle2(int radius) {   
		this.radius = radius;   // this�� ������ �߿��ϴ�. ������ 0���
	}
	
	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10);
		System.out.println(pizza.getArea());

	}

}
