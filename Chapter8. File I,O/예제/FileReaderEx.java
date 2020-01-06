import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;
		
		try{
			// 파일입력 스트림 : FileReader
			fin = new FileReader("c:\\windows\\system.ini");
			int c; // -1을 위해 int 선언
			// read() 메소드 
			while((c=fin.read()) != -1 ) { // 한 문자씩 파일 끝까지 읽기
				System.out.print((char)c); // 문자는 char형이므로 형변환
			}
			fin.close();
		}
		catch(IOException e) { // 파일이 없을 경우
			System.out.println("입출력 오류");
		}
	}
}
