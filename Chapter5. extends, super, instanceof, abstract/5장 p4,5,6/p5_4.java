// 20154010 이병준 5장 4번문제
import java.util.Scanner;
// 추상클래스 Converter
abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
		scanner.close();
	}
}

class Km2Mile extends Converter{ // Converter을 상속받는 Km2Mile
	public Km2Mile(double ratio) { // 생성자
	    this.ratio = ratio;
	}
	public double convert(double src) { // convert 메소드
		return src/ratio;
	}
	public String getSrcString() {	// KM 출력
		return "KM";
	}
	public String getDestString() { // mile 출력
		return "mile";
	}

}
public class p5_4 {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

}
