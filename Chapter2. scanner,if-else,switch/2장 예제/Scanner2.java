import java.util.Scanner;
public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.print("금액을 입력하시오>>");
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
		
		System.out.print("오만원권"+ oman +"매 ");
		System.out.print("만원권"+ man +"매 ");
		System.out.print("천원권"+ chun +"매 ");
		System.out.print("백원권"+ bac +"개 ");
		System.out.print("오십원"+ osip +"개 ");
		System.out.print("십원"+ sip +"개 ");
		System.out.print("일원"+ won +"개 ");
		
		scanner.close();
				
		
				

	}

}
