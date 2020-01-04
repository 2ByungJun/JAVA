class Calc {
	public static int abs(int a) { return a>0 ? a : -a; }
	// static이 없을 경우 실행이 불가능하다.
	public static int max(int a, int b) { return a>b ? a : b; }
	public static int min(int a, int b) { return a>b ? b : a; }
}


public class CalcEX {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5)); // Calc.abs 호출방식은 static가 필요하다.
		// 없게 사용하고 싶으면 Calc의 객체를 따로 생성해야한다.
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));
	}
}
