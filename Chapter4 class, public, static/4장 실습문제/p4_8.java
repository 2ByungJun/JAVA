import java.util.Scanner;

class Phone{
	String name;
	String tel;
	
	public Phone(String name,String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel( ) {
		return tel;
	}

}

public class p4_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone [] myPhone;
		
		System.out.print("�ο���>>");
		int num = scanner.nextInt();

		myPhone = new Phone[num];

		for( int i=0; i<num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.nextLine();
			String tel = scanner.nextLine();
		    myPhone[i] = new Phone( name , tel );
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
		scanner.close();
	}
}
