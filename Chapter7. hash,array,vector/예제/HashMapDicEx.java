import java.util.*;

public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String,String> dic = new HashMap<String,String>();
		// var dic = new HashMap<String,String>(); ����
		
		// (key,value)������ dic�� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("ã�� ���� �ܾ��?");
			String eng = scanner.next();
			
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			// eng�� �ؽøʿ� ������ null ����
			String kor = dic.get(eng);
			if(kor==null)
				System.out.println(eng + "�� ���� �ܾ� �Դϴ�.");
			else
				System.out.println(kor);
		}
		scanner.close();
	}
}
