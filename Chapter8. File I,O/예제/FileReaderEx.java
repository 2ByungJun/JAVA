import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;
		
		try{
			// �����Է� ��Ʈ�� : FileReader
			fin = new FileReader("c:\\windows\\system.ini");
			int c; // -1�� ���� int ����
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
