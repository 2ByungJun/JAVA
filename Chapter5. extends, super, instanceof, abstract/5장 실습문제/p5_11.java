import java.util.Scanner;

abstract class Calc {
	abstract void setValue(int a,int b);
	abstract int calculate();
}

class Add extends Calc{
    private int a;
    private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a+b;
	}
}

class Sub extends Calc{
    private int a;
    private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a-b;
	}
}

class Mul extends Calc{
    private int a;
    private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a*b;
	}
}

class Div extends Calc{
    private int a;
    private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a/b;
	}
}

public class p5_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char c = scanner.next().charAt(0);
		
		switch(c) {
		case '+':
			Add A = new Add();
			A.setValue(a, b);
			System.out.println(A.calculate());
			break;
		case '-':
			Sub S = new Sub();
			S.setValue(a, b);
			System.out.println(S.calculate());
			break;
		case '*':
			Mul M = new Mul();
			M.setValue(a, b);
			System.out.println(M.calculate());
			break;
		case '/':
			Div D = new Div();
			D.setValue(a, b);
			System.out.println(D.calculate());
			break;
		}

		scanner.close();
	}

}
