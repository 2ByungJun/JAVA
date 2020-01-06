import java.io.*;
import java.util.Scanner;

public class BufferendIOEx {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\\\Users\\\\M518\\\\Desktop\\\\hangul.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while((c=fin.read()) != -1 ){
				out.write(c);
			}
			
			new Scanner(System.in).nextLine();
			out.close();
			fin.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
