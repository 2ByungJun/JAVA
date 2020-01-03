
public class RandomB {

	public static void main(String[] args) {
		
		int num[] = new int[10]; 
		
		for(int i=0; i<10; i++)
		   num[i]=(int)(Math.random()*10+1);
		
		double average=0.0;
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i=0; i<10; i++) {
			System.out.print(num[i] + " ");
			average += num[i]; 
		}
		
		System.out.print("\nÆò±ÕÀº "+ average/10 );
	}

}
