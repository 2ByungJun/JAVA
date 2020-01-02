import java.util.Scanner;
public class Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원화를 입력하세요(단위 원) >>");
		Scanner scanner = new Scanner(System.in);
		
		int won = scanner.nextInt();
		
		double dal = (double)won/1100.0;
		System.out.print(won +"원은 ");
		System.out.printf("%.2f",dal);
		System.out.print("입니다 ");
		


		scanner.close();
	}

}
