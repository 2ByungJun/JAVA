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
		
		System.out.print("인원수>>");
		int num = scanner.nextInt();

		myPhone = new Phone[num];

		for( int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.nextLine();
			String tel = scanner.nextLine();
		    myPhone[i] = new Phone( name , tel );
		}
		
		System.out.println("저장되었습니다...");
		
		scanner.close();
	}
}
