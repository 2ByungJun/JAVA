// 20154010 �̺��� 4�� 2������
import java.util.Scanner;

class Grade {
	// private�� �����غ��Ҵ�.
	private int math;
	private int science;
	private int english;
	
	// Grade(�Ű�����3��) ������ ����
	public Grade(int math,int science,int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	// ����� ���ϴ� �Լ� ���� 
	public double average() {
		return (math+science+english)/3;
	}

}

public class p241_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("����� " + me.average());
		// average()�� ����� ����Ͽ� ����
		
		scanner.close();
	}
}
