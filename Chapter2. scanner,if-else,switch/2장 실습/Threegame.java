// 20154010 이병준 2장 6번문제
import java.util.Scanner;

public class Threegame {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		int i=0;
		
		System.out.print("박수");
		if ( num%10 == 3 || num%10 == 6 || num%10 == 9 ) {
			System.out.print("짝");
			i++;
		}
		if ( num/10 == 3 || num/10 == 6 || num/10 == 9 ) {
			System.out.print("짝");
			i++;
		}
		if ( i == 0 )
			System.out.print("는 없습니다.");

		scanner.close();
	}

}
