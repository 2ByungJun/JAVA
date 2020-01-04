// 20154010 �̺��� 4�� 5������
import java.util.Scanner;

class Circle {
	private double x,y;
	private int radius;
	
	// x,y,radius �ʱ�ȭ
	public Circle(double x,double y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	} 
	
	// ��� �żҵ�
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius );
	}
}

public class p243_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner ����
		Circle c [] = new Circle[3]; // 3���� Circle �迭 ����
		
		for(int i=0; i<c.length; i++) { // c�迭 ũ�⸸ŭ �ݺ�
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();  // x�� �б�
			double y = scanner.nextDouble();  // y�� �б�
			int radius = scanner.nextInt();   // ������ �б�
			c[i] = new Circle(x,y,radius);    // Circle ��ü ����
		}
		for(int i=0; i<c.length; i++) 
			c[i].show(); // ��� Circle��� 
		
		scanner.close();
	}
}
