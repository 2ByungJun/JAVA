import java.util.Scanner;

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StackApp implements Stack{
	private int top;
	private String[] stackApp;
	
	public StackApp(int maxSize) {
		stackApp = new String[maxSize];
		top = -1;
	}

	@Override
	public int length() {
		return top+1;
	}

	@Override
	public int capacity() {
		return stackApp.length;
	}

	@Override
	public String pop() {
		if ( top == -1 )
			return null;
		String s = stackApp[top];
		top--;
		return s;
	}

	@Override
	public boolean push(String val) {
		if (top == stackApp.length -1)
		return false;
		else {
			top++;
			stackApp[top] = val;
			return true;
		}
	}	
}

public class p5_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = scanner.nextInt();
		
		StackApp app = new StackApp(size);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String val = scanner.next();
	        if ( val.equals("그만"))
	        	break;
	        boolean res = app.push(val);
	        if(res == false) {
	            System.out.println("스택이 꽉 차서 푸시 불가!");
	        }
		}
		
	    System.out.print("스택에 저장된 모든 문자열 팝 : ");
	    int len = app.length();
	    for ( int i =0; i<len; i++) {
	        System.out.print(app.pop() + " ");
	    }
	        
		
		scanner.close();

	}

}
