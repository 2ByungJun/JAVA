import java.util.Scanner;
public class Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �Է��ϼ���(���� ��) >>");
		Scanner scanner = new Scanner(System.in);
		
		int won = scanner.nextInt();
		
		double dal = (double)won/1100.0;
		System.out.print(won +"���� ");
		System.out.printf("%.2f",dal);
		System.out.print("�Դϴ� ");
		


		scanner.close();
	}

}
