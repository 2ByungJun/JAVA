// 20154010 �̺��� 3�� 6������
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	// ȯ���� ���� ����
	int []unit = {50000,10000,1000,500,100,50,10,1};
	
	// �ݾ� �Է�
	System.out.print("�ݾ��� �Է��ϼ���>>");
	int money = scanner.nextInt();
	
	// ȯ��
	for(int i=0; i<unit.length; i++) {
		int num = money/unit[i]; // ���� ȭ�� ����
		money = money%unit[i];   // �������� money�� �� ����
		if (num != 0)            // 0���� ��� ��� ����
	    System.out.println(unit[i] + "�� ¥�� : " + num + "��" );
	}
	
	scanner.close();

	}

}
