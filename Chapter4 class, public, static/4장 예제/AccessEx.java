class Sample{
	public int a;
	protected int b;  // private���� ����� b�� �ٸ� ������ ����� �� ����.
	                  // protected,public�� �����ϴ�.
	int c;            // default�� ���� ���Ͽ� �������� ��� �����ϴ�.
}
public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.b = 10;
		aClass.c = 10;
	}

}
