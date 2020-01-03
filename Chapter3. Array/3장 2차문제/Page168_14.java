// 20154010 이병준 13장-14번
import java.util.Scanner;

public class Page168_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course [] = { "java", "C++", "HTML5",
				              "컴퓨터구조","안드로이드"};
		int score [] = {95,88,76,62,55};
		
	    while(true){
			System.out.print("과목 이름>>");
			String s = scanner.next();
			
			// "그만"일시 종료
			if(s.equals("그만"))
				break;
			
			// 해당 점수 출력
			for(int i=0; i<course.length; i++) {
				if( s.equals(course[i])) {
					System.out.format("%s", course[i]);
					System.out.println("의 점수는 " + score[i] );
					break;
				}
				// 없는 경우
				else if(!s.equals(course) && i == 4) {
					System.out.println("없는 과목입니다.");
					break;
				}
			}
		}
	    scanner.close();
	}

}
