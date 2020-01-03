// 20154010 이병준 3장 6번문제
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	// 환산할 돈의 종류
	int []unit = {50000,10000,1000,500,100,50,10,1};
	
	// 금액 입력
	System.out.print("금액을 입력하세요>>");
	int money = scanner.nextInt();
	
	// 환산
	for(int i=0; i<unit.length; i++) {
		int num = money/unit[i]; // 몫은 화폐 개수
		money = money%unit[i];   // 나머지를 money에 재 저장
		if (num != 0)            // 0개일 경우 출력 제한
	    System.out.println(unit[i] + "원 짜리 : " + num + "개" );
	}
	
	scanner.close();

	}

}
