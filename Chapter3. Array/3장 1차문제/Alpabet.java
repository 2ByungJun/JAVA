// 20154010 �̺��� 3�� 4������
import java.util.Scanner;

public class Alpabet {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner scanner = new Scanner(System.in);

		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = scanner.next();
		char alpa = s.charAt(0);   // �Է¹��� ���ڿ� �� �� ���� ����
		char c = 'a';  // ���� c�� a�� �ʱ�ȭ
		int i, j;      // �ݺ� ����
		int count = 0; // a���� �Է¹��� ���ڱ����� ����

		// count�� ���ϱ�
		do {
			c = (char) (c + 1);
			count++;
		} while (c <= alpa);
		
        // 2��ø �ݺ����� �̿��� ���ĺ� ���
		for (i = 0; i < count; i++) {
			c = 'a'; // a�� �ʱ�ȭ
			for (j = count; j > i; j--) {
				System.out.print(c); // ���� ���
				c = (char) (c + 1);  // ���� ���� ����
			}
			System.out.print("\n");
		}

		scanner.close();
	}
}
