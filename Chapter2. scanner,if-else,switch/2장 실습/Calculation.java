// 20154010 �̺��� 2�� 12������
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����>>");
		double a = scanner.nextDouble();  // ����1
		String cal = scanner.next();      // ������
		double b = scanner.nextDouble();  // ����2
		
		// ���� if-else
		if( cal.equals("+") )
			System.out.print(a + cal + b + "�� ������� " + (a+b) );
		else if( cal.equals("-"))
			System.out.print(a + cal + b + "�� ������� " + (a-b) );
		else if( cal.equals("*"))
			System.out.print(a + cal + b + "�� ������� " + (a*b) );
		else if( cal.equals("/"))
		{
			if( b == 0 )
				System.out.print("0���� ���� �� �����ϴ�.");
			else
				System.out.print(a + cal + b + "�� ������� " + (a/b));
		}
		scanner.close();
	}
}
