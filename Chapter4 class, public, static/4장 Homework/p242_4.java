// 20154010 �̺��� 4�� 4������
class Rectangle{
	int x,y,width,height; // x��ǥ,y��ǥ,�ʺ�,����
	// ��¹�
	void show() { System.out.println("(" + x + "," + y + ")" 
			    +"���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");}
	
	// x,y,width,height�� �Ű������� ���� ������
	public Rectangle(int x,int y,int width,int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	// �簢�� ���̸� ���ϴ� �޼ҵ�
	public int square() {
		return width*height;
	}
	// �Ű������� ���� r�� �� �簢�� �ȿ� �ִ� ��� �Ǵ�
	public boolean contains(Rectangle r) {
		if( r.x+r.width < x+width && r.y+r.height < 
				 y + height )
		return true;
		else
			return false;
	}

}
public class p242_4 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
}
