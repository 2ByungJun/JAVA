// 20154010 �̺��� 2�� 10��
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner scanner = new Scanner(System.in);

		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int circle1_x = scanner.nextInt(); // ù��° �� x��ǥ
		int circle1_y = scanner.nextInt(); // ù��° �� y��ǥ
		double circle1_r = scanner.nextDouble(); // ù��° �� ������
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int circle2_x = scanner.nextInt(); // �ι�° �� x��ǥ
		int circle2_y = scanner.nextInt(); // �ι��� �� y��ǥ
		double circle2_r = scanner.nextDouble(); // �ι�° �� ������
		
		// �� �� ������ �Ÿ�
		int dictionary = circle1_x-circle2_x + circle1_y-circle2_y;		
		// r + r' > d  ( ���� ���� ��ġ�� ��� )
		if( dictionary  < circle1_r + circle2_r)
			System.out.print("�� ���� ���� ��ģ��.");
		
		scanner.close();
	}
}
