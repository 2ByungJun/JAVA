
public class Circle {
	int radius;
	String name;
	
	public Circle() {   // 주석처리할 경우 실행이 안된다.
		radius = 1;     // 디폴트 생성자를 지워주면 안된다.
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
		Circle pizza = new Circle(10,"자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle dount = new Circle();
		dount.name = "도넛피자";
		area = dount.getArea();
		System.out.println(dount.name + "의 면적은 " + area);

	}

}
