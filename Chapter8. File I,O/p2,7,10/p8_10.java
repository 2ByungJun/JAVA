import java.util.*;
import java.io.*;

public class p8_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fileName = "c:\\temp\\phone.txt";
		HashMap<String, String> phoneMap = new HashMap<String, String>();
		
		// ���� �б�
		try {
			Scanner fScanner = new Scanner(new FileReader(new File(fileName)));
			while(fScanner.hasNext()) {
				String name = fScanner.next(); // �̸� �б�
				String tel = fScanner.next(); // ��ȭ��ȣ �б�
				phoneMap.put(name, tel); // �ؽøʿ� ����
			}			
			fScanner.close();	
		} 
		catch (IOException e) { // ������ ������ �� ���� ��� ����
			e.printStackTrace();
		}
		
		System.out.println("�� " + phoneMap.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");
		
		while(true) {
			System.out.print("�̸�>> ");
			String name = scanner.next(); // �̸� �Է�
			if(name.equals("�׸�"))
				break;
			String tel = phoneMap.get(name);
			if(tel == null) {
				System.out.println("ã�� �̸��� �����ϴ�.");			
			}
			else{
				System.out.println(tel);
			}
		}
		
		scanner.close();
	}
}
