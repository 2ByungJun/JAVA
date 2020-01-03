// 20154010 이병준 3장-16번
import java.util.Scanner;

public class Page168_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"가위","바위","보"};

		System.out.println("컴퓨터와 가위 바위 보 게입을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			String s = scanner.next();
			
			// "그만"일 경우 종료
			if( s.equals("그만"))
				break;
			// n에 0,1,2중 랜덤 대입
			int n = (int)(Math.random()*3);
			
			System.out.print("사용자 = "+ s + " , " + "컴퓨터 = "
			                   + str[n] +", " ); 
			// 가위바위보 결과
			if(str[n].equals("가위")) {
				if( s.equals("가위"))
					System.out.println("비겼습니다.");
				else if(s.equals("바위"))
					System.out.println("사용자가 이겼습니다." );
				else if(s.equals("보"))
					System.out.println("컴퓨터가 이겼습니다.");
			}
			else if(str[n].equals("바위")) {
				if( s.equals("바위"))
					System.out.println("비겼습니다.");
				else if(s.equals("보"))
					System.out.println("사용자가 이겼습니다." );
				else if(s.equals("가위"))
					System.out.println("컴퓨터가 이겼습니다.");
			}
			else if(str[n].equals("보")) {
				if( s.equals("보"))
					System.out.println("비겼습니다.");
				else if(s.equals("가위"))
					System.out.println("사용자가 이겼습니다." );
				else if(s.equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
			}			
		}
		scanner.close();
	}

}
