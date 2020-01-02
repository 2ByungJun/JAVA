// 20154010 이병준 2장 12번문제
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산>>");
		double a = scanner.nextDouble();  // 정수1
		String cal = scanner.next();      // 연산자
		double b = scanner.nextDouble();  // 정수2
		
		// 계산기 if-else
		if( cal.equals("+") )
			System.out.print(a + cal + b + "의 계산결과는 " + (a+b) );
		else if( cal.equals("-"))
			System.out.print(a + cal + b + "의 계산결과는 " + (a-b) );
		else if( cal.equals("*"))
			System.out.print(a + cal + b + "의 계산결과는 " + (a*b) );
		else if( cal.equals("/"))
		{
			if( b == 0 )
				System.out.print("0으로 나눌 수 없습니다.");
			else
				System.out.print(a + cal + b + "의 계산결과는 " + (a/b));
		}
		scanner.close();
	}
}
