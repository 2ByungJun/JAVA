import java.io.*;
import java.util.*;

public class p8_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		System.out.println("전화번호 입력 프로그램입니다.");
		try 
		{
		       fout = new FileWriter("c:\\temp\\phone.txt");
		       File f1 = new File("c:\\temp\\phone.txt");
		
		   while(true) {
			System.out.print("이름 전화번호 >> ");
			String line = scanner.nextLine();
			if(line.equalsIgnoreCase("그만") == true)
				break;
			fout.write(line,0,line.length());
			fout.write("\r\n",0,2); 
		    }
		System.out.print(f1.getPath() + "에 저장하였습니다.");
		fout.close();
		
		}
		catch(IOException e) { System.out.println("파일 에러"); }
		
		scanner.close();

	}

}
