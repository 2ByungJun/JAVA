// 20154010 �̺��� 2�� 6������
import java.util.Scanner;

public class Threegame {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = scanner.nextInt();
		int i=0;
		
		System.out.print("�ڼ�");
		if ( num%10 == 3 || num%10 == 6 || num%10 == 9 ) {
			System.out.print("¦");
			i++;
		}
		if ( num/10 == 3 || num/10 == 6 || num/10 == 9 ) {
			System.out.print("¦");
			i++;
		}
		if ( i == 0 )
			System.out.print("�� �����ϴ�.");

		scanner.close();
	}

}
