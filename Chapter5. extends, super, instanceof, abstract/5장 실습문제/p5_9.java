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
		
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size = scanner.nextInt();
		
		StackApp app = new StackApp(size);
		
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			String val = scanner.next();
	        if ( val.equals("�׸�"))
	        	break;
	        boolean res = app.push(val);
	        if(res == false) {
	            System.out.println("������ �� ���� Ǫ�� �Ұ�!");
	        }
		}
		
	    System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
	    int len = app.length();
	    for ( int i =0; i<len; i++) {
	        System.out.print(app.pop() + " ");
	    }
	        
		
		scanner.close();

	}

}
