import java.util.Scanner;

public class Threegame2 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		// num < 100 ������ �ݺ���
		while (num < 100) {
			// num�� 3,6,9�� �� ��츸 ��°���
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9 || 
					num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
				if (num != 3) // ó�� ��¶� �ٹٲ��� ������ �ʱ����� ����
					System.out.print("\n");
				System.out.print(" " + num);
				System.out.print(" �ڼ� ");
			}
			// 10�� �ڸ� 3, 6, 9
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				System.out.print("¦");
			}
			// 1�� �ڸ� 3, 6, 9
			if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
				System.out.print("¦");
			}
			num++;
		}
		scanner.close();
	}
}
