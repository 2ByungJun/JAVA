import java.util.Scanner;

public class Calculation_swtich {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner scanner = new Scanner(System.in);

		System.out.print("����>>");
		double a = scanner.nextDouble(); // ����1
		String cal = scanner.next(); // ������
		double b = scanner.nextDouble(); // ����2

		// ���� switch
		switch (cal) {
		case "+": {
			System.out.print(a + cal + b + "�� ������� " + (a + b));
			break;}
		case "-": {
			System.out.print(a + cal + b + "�� ������� " + (a - b));
			break;}
		case "*": {
			System.out.print(a + cal + b + "�� ������� " + (a * b));
			break;}
		case "/": {
			if (b == 0)
				System.out.print("0���� ���� �� �����ϴ�.");
			else
				System.out.print(a + cal + b + "�� ������� " + (a / b));
			break;}
		}
		scanner.close();
	}

}
