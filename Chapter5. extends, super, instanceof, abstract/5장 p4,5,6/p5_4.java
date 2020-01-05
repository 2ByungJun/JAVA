// 20154010 �̺��� 5�� 4������
import java.util.Scanner;
// �߻�Ŭ���� Converter
abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�");
		scanner.close();
	}
}

class Km2Mile extends Converter{ // Converter�� ��ӹ޴� Km2Mile
	public Km2Mile(double ratio) { // ������
	    this.ratio = ratio;
	}
	public double convert(double src) { // convert �޼ҵ�
		return src/ratio;
	}
	public String getSrcString() {	// KM ���
		return "KM";
	}
	public String getDestString() { // mile ���
		return "mile";
	}

}
public class p5_4 {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

}
