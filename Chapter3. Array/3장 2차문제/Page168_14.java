// 20154010 �̺��� 13��-14��
import java.util.Scanner;

public class Page168_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course [] = { "java", "C++", "HTML5",
				              "��ǻ�ͱ���","�ȵ���̵�"};
		int score [] = {95,88,76,62,55};
		
	    while(true){
			System.out.print("���� �̸�>>");
			String s = scanner.next();
			
			// "�׸�"�Ͻ� ����
			if(s.equals("�׸�"))
				break;
			
			// �ش� ���� ���
			for(int i=0; i<course.length; i++) {
				if( s.equals(course[i])) {
					System.out.format("%s", course[i]);
					System.out.println("�� ������ " + score[i] );
					break;
				}
				// ���� ���
				else if(!s.equals(course) && i == 4) {
					System.out.println("���� �����Դϴ�.");
					break;
				}
			}
		}
	    scanner.close();
	}

}
