import java.io.*;

public class p8_2 {
	public static void main(String[] args) {
		FileReader fin = null;
		
		try{
			// �����Է� ��Ʈ�� : FileReader
			fin = new FileReader("c:\\temp\\phone.txt");
			File f1 = new File("c:\\temp\\phone.txt");
			int c; // -1�� ���� int ����
			
			System.out.println(f1.getPath() + "�� ����մϴ�.");
			// read() �޼ҵ� 
			while((c=fin.read()) != -1 ) { // �� ���ھ� ���� ������ �б�
				System.out.print((char)c); // ���ڴ� char���̹Ƿ� ����ȯ
			}
			fin.close();
		}
		catch(IOException e) { // ������ ���� ���
			System.out.println("����� ����");
		}

	}

}
