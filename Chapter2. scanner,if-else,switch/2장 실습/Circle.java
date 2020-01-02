// 20154010 이병준 2장 10번
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int circle1_x = scanner.nextInt(); // 첫번째 원 x좌표
		int circle1_y = scanner.nextInt(); // 첫번째 원 y좌표
		double circle1_r = scanner.nextDouble(); // 첫번째 원 반지름
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int circle2_x = scanner.nextInt(); // 두번째 원 x좌표
		int circle2_y = scanner.nextInt(); // 두번재 원 y좌표
		double circle2_r = scanner.nextDouble(); // 두번째 원 반지름
		
		// 두 점 사이의 거리
		int dictionary = circle1_x-circle2_x + circle1_y-circle2_y;		
		// r + r' > d  ( 원이 서로 겹치는 경우 )
		if( dictionary  < circle1_r + circle2_r)
			System.out.print("두 원은 서로 겹친다.");
		
		scanner.close();
	}
}
