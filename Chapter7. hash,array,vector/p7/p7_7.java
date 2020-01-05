import java.util.*;

public class p7_7 {
	public static void main(String[] args) {
		// HashMap <String,Double>선언
		HashMap<String,Double> dic = new HashMap<String,Double>();
		Scanner scanner = new Scanner(System.in);
		
		String name;    // 이름
		double average; // 학점
		
		// (name,average)쌍으로 dic에 저장
		System.out.println("미래장학금관리시스템입니다.");
		
		// 5회 이름과 학점을 받아서 dic에 put
		for( int i=0; i<5; i++) {
			System.out.print("이름과 학점>> ");
			name = scanner.next();
			average = scanner.nextDouble();
			dic.put(name, average); // dic에 저장
		}
		
		// 선발 학점 기준 입력
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double cut_value = scanner.nextDouble();
		
		// 장학생 명단 호출
		System.out.print("장학생 명단 : ");
		Set<String> nameSet = dic.keySet(); // 모든 key를 가진 Set 컬렉션 리턴
		Iterator<String> it = nameSet.iterator(); // Set에 있는 모든 key를 순서대로
		                                          // 검색하는 Iterator 리턴
		while(it.hasNext()) {
			name = it.next();        // 해당 이름 
			average = dic.get(name); // 해당 점수
			if(average > cut_value)  // 해당 점수가 장학생 명단이 될수있는지 조건
				System.out.print(name + " ");
		}
		
		scanner.close();

	}

}
