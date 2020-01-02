import java.util.Scanner; 

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("달을 입력하시오>>");
		Scanner scanner =new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		switch(month)
		{
		case 1:
		case 2:
		case 12:	
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:			
		case 7:			
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
					
		default:
			System.out.println("잘못 입력하셨습니다.");
		
		}
		
		
		scanner.close();
	}

}
