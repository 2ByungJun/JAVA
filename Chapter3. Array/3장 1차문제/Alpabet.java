// 20154010 이병준 3장 4번문제
import java.util.Scanner;

public class Alpabet {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);

		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		char alpa = s.charAt(0);   // 입력받은 문자열 맨 앞 문자 저장
		char c = 'a';  // 문자 c를 a로 초기화
		int i, j;      // 반복 변수
		int count = 0; // a부터 입력받은 문자까지의 길이

		// count값 구하기
		do {
			c = (char) (c + 1);
			count++;
		} while (c <= alpa);
		
        // 2중첩 반복문을 이용한 알파벳 출력
		for (i = 0; i < count; i++) {
			c = 'a'; // a로 초기화
			for (j = count; j > i; j--) {
				System.out.print(c); // 문자 출력
				c = (char) (c + 1);  // 다음 문자 대입
			}
			System.out.print("\n");
		}

		scanner.close();
	}
}
