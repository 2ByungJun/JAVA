import java.util.*;

public class p7_7 {
	public static void main(String[] args) {
		// HashMap <String,Double>����
		HashMap<String,Double> dic = new HashMap<String,Double>();
		Scanner scanner = new Scanner(System.in);
		
		String name;    // �̸�
		double average; // ����
		
		// (name,average)������ dic�� ����
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		
		// 5ȸ �̸��� ������ �޾Ƽ� dic�� put
		for( int i=0; i<5; i++) {
			System.out.print("�̸��� ����>> ");
			name = scanner.next();
			average = scanner.nextDouble();
			dic.put(name, average); // dic�� ����
		}
		
		// ���� ���� ���� �Է�
		System.out.print("���л� ���� ���� ���� �Է�>> ");
		double cut_value = scanner.nextDouble();
		
		// ���л� ��� ȣ��
		System.out.print("���л� ��� : ");
		Set<String> nameSet = dic.keySet(); // ��� key�� ���� Set �÷��� ����
		Iterator<String> it = nameSet.iterator(); // Set�� �ִ� ��� key�� �������
		                                          // �˻��ϴ� Iterator ����
		while(it.hasNext()) {
			name = it.next();        // �ش� �̸� 
			average = dic.get(name); // �ش� ����
			if(average > cut_value)  // �ش� ������ ���л� ����� �ɼ��ִ��� ����
				System.out.print(name + " ");
		}
		
		scanner.close();

	}

}
