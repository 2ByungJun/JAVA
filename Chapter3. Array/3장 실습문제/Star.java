import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�>>");
		int star = scanner.nextInt();
		
		for(int i=star; i>0; i--) {
			for( int j=0; j<i; j++) 
		    	System.out.print("*");
			System.out.print("\n");
		}
		
		scanner.close();
	}
}
