import java.util.Scanner;

public class Threegame2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		// num < 100 까지의 반복문
		while (num < 100) {
			// num에 3,6,9가 들어갈 경우만 출력가능
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9 || 
					num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
				if (num != 3) // 처음 출력때 줄바꿈을 해주지 않기위한 조건
					System.out.print("\n");
				System.out.print(" " + num);
				System.out.print(" 박수 ");
			}
			// 10의 자리 3, 6, 9
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				System.out.print("짝");
			}
			// 1의 자리 3, 6, 9
			if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
				System.out.print("짝");
			}
			num++;
		}
		scanner.close();
	}
}
