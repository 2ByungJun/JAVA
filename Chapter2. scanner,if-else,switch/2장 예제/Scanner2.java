import java.util.Scanner;
public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		Scanner scanner =new Scanner(System.in);
		
		int money = scanner.nextInt();
		
		int oman = money/50000;
		
		money  = money - (oman*50000);
		
		int man = money/10000;
		
		money = money - (man *10000);
		
		int chun = money/1000;
		
		money  = money - (chun*1000);
		
		int bac = money/100;
		
		money  = money - (bac*100);
		
		int osip = money/50;
		
		money = money -(osip*50);
		
		int sip = money/10;
		
		money  = money - (sip*10);
		
		int won = money/1;
		
		System.out.print("��������"+ oman +"�� ");
		System.out.print("������"+ man +"�� ");
		System.out.print("õ����"+ chun +"�� ");
		System.out.print("�����"+ bac +"�� ");
		System.out.print("���ʿ�"+ osip +"�� ");
		System.out.print("�ʿ�"+ sip +"�� ");
		System.out.print("�Ͽ�"+ won +"�� ");
		
		scanner.close();
				
		
				

	}

}
