// 20154010 �̺��� 2�� 5������
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
	Scanner  scanner = new Scanner(System.in); // scanner��ü����
		
		
		System.out.print("���� ������ �Է��Ͻÿ�>> ");
		int num1 = scanner.nextInt(); // ���� �б�
		int num2 = scanner.nextInt(); // ���� �б�
		int num3 = scanner.nextInt(); // ���� �б�
        
		if( num1+num2>num3 && num1+num3>num2 && num2+num3>num1) 
			System.out.print("�ﰢ���� �˴ϴ�");
		else 
			System.out.print("�ﰢ���� �����ʽ��ϴ�.");
		
		scanner.close();
	}
}
