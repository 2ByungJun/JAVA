// 20154010 이병준 4장 5번문제
import java.util.Scanner;

class Circle {
	private double x,y;
	private int radius;
	
	// x,y,radius 초기화
	public Circle(double x,double y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	} 
	
	// 출력 매소드
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius );
	}
}

public class p243_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner 선언
		Circle c [] = new Circle[3]; // 3개의 Circle 배열 선언
		
		for(int i=0; i<c.length; i++) { // c배열 크기만큼 반복
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();  // x값 읽기
			double y = scanner.nextDouble();  // y값 읽기
			int radius = scanner.nextInt();   // 반지름 읽기
			c[i] = new Circle(x,y,radius);    // Circle 객체 생성
		}
		for(int i=0; i<c.length; i++) 
			c[i].show(); // 모든 Circle출력 
		
		scanner.close();
	}
}
