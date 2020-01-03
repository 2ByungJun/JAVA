import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			
			/* 문자열 비교시 equals 사용 */
			if(text.equals("exit")) // "exit"이 입력되면 반복 종료
				break; // while문을 벗어남
		}
		
		System.out.println("종료합니다...");
		
		scanner.close();

	}

}
