class Person {
	private int weight;
	int age;             // default 선언 ( 같은 패키지 내에만 접근가능 )
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age=30;
		name="홍길동";
		height=175;
		weight=99;         // private로 선언되었기 때문에 실행오류
		setWeight(99);
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();

	}

}
