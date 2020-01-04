class Sample{
	public int a;
	protected int b;  // private으로 선언된 b는 다른 곳에서 사용할 수 없다.
	                  // protected,public는 가능하다.
	int c;            // default는 같은 파일에 묶여있을 경우 가능하다.
}
public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.b = 10;
		aClass.c = 10;
	}

}
