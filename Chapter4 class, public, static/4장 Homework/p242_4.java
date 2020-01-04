// 20154010 이병준 4장 4번문제
class Rectangle{
	int x,y,width,height; // x좌표,y좌표,너비,높이
	// 출력문
	void show() { System.out.println("(" + x + "," + y + ")" 
			    +"에서 크기가 " + width + "x" + height + "인 사각형");}
	
	// x,y,width,height를 매개변수로 가진 생성자
	public Rectangle(int x,int y,int width,int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	// 사각형 넓이를 구하는 메소드
	public int square() {
		return width*height;
	}
	// 매개변수로 받은 r이 현 사각형 안에 있는 경우 판단
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
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
}
