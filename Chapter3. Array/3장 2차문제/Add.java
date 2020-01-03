// 20154010 이병준 3장-12번문제
public class Add {

	public static void main(String[] args) {
	
		  int sum = 0;
		  for(int i = 0; i<args.length; i++)
		  {
		   
		   // 에러 방지 try-catch 
		   try{
		       int n = Integer.parseInt(args[i]);
		       sum +=n;
		   }
		   catch(NumberFormatException e){
		       System.out.print(""); 
		   } 
		  }
		  System.out.println(sum);
	}

}
