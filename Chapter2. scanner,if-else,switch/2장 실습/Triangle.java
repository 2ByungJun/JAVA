// 20154010 이병준 2장 5번문제
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
	Scanner  scanner = new Scanner(System.in); // scanner객체생성
		
		
		System.out.print("정수 세개를 입력하시오>> ");
		int num1 = scanner.nextInt(); // 정수 읽기
		int num2 = scanner.nextInt(); // 정수 읽기
		int num3 = scanner.nextInt(); // 정수 읽기
        
		if( num1+num2>num3 && num1+num3>num2 && num2+num3>num1) 
			System.out.print("삼각형이 됩니다");
		else 
			System.out.print("삼각형이 되지않습니다.");
		
		scanner.close();
	}
}
