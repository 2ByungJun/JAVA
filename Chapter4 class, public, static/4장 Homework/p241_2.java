// 20154010 이병준 4장 2번문제
import java.util.Scanner;

class Grade {
	// private로 선언해보았다.
	private int math;
	private int science;
	private int english;
	
	// Grade(매개변수3개) 생성자 생성
	public Grade(int math,int science,int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	// 평균을 구하는 함수 생성 
	public double average() {
		return (math+science+english)/3;
	}

}

public class p241_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("평균은 " + me.average());
		// average()는 평균을 계산하여 리턴
		
		scanner.close();
	}
}
