import java.io.*;
import java.util.*;

public class p8_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		try 
		{
		       fout = new FileWriter("c:\\temp\\phone.txt");
		       File f1 = new File("c:\\temp\\phone.txt");
		
		   while(true) {
			System.out.print("�̸� ��ȭ��ȣ >> ");
			String line = scanner.nextLine();
			if(line.equalsIgnoreCase("�׸�") == true)
				break;
			fout.write(line,0,line.length());
			fout.write("\r\n",0,2); 
		    }
		System.out.print(f1.getPath() + "�� �����Ͽ����ϴ�.");
		fout.close();
		
		}
		catch(IOException e) { System.out.println("���� ����"); }
		
		scanner.close();

	}

}
