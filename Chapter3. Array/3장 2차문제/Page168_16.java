// 20154010 �̺��� 3��-16��
import java.util.Scanner;

public class Page168_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"����","����","��"};

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {
			System.out.print("���� ���� ��!>>");
			String s = scanner.next();
			
			// "�׸�"�� ��� ����
			if( s.equals("�׸�"))
				break;
			// n�� 0,1,2�� ���� ����
			int n = (int)(Math.random()*3);
			
			System.out.print("����� = "+ s + " , " + "��ǻ�� = "
			                   + str[n] +", " ); 
			// ���������� ���
			if(str[n].equals("����")) {
				if( s.equals("����"))
					System.out.println("�����ϴ�.");
				else if(s.equals("����"))
					System.out.println("����ڰ� �̰���ϴ�." );
				else if(s.equals("��"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if(str[n].equals("����")) {
				if( s.equals("����"))
					System.out.println("�����ϴ�.");
				else if(s.equals("��"))
					System.out.println("����ڰ� �̰���ϴ�." );
				else if(s.equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if(str[n].equals("��")) {
				if( s.equals("��"))
					System.out.println("�����ϴ�.");
				else if(s.equals("����"))
					System.out.println("����ڰ� �̰���ϴ�." );
				else if(s.equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}			
		}
		scanner.close();
	}

}
