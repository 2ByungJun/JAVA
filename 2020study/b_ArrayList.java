import java.util.*;

/**
 * ArrayList?
 * - List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형리스트
 * - 일반적인 배열과 같은 순차리스트
 * - 인덱스로 내부의 객체 관리
 * - 배열과 다르게 부족하다면 크기가 가변적으로 늘어남
 */

class Student{
    String name;
    int age;
}

class a_ArrayList {
    public static void main(String[] args) {
        /**
         * ArrayList선언시 ArrayList list = new ArrayList()로 선언 후 내부에 임의의 값을 넣고 
         * 사용할수도 있지만 이렇게 사용할경우 값을 뽑아내기 위해서는 캐스팅(Casting) 연산이 필요하고 
         * 잘못된 타입으로 캐스팅을 한 경우에는 에러가 발생하기에 위와 같은 방식은 추천하지 않습니다. 
         * ArrayList를 사용할시에는 ArrayList에 타입을 명시해주는것이 좋습니다. 
         * JDK 5.0이후부터 자료형의 안정성을 위해 제너릭스(Generics)라는 개념이 도입되었습니다.
         */
        var list = new ArrayList<String>(); // 타입 미설정 : Object
        ArrayList<Student> members = new ArrayList<Student>(); // type : Student객체
        ArrayList<Integer> num = new ArrayList<Integer>(); // type : int
        
        addList(list, "1");
        addList(list, "2");
        list.clear(); // 리스트 클리어

        // 삽입할 때 자리가 비어있으면 에러발생
        addList(list, "처음");
        addList(list, null); 
        addList(list, "끝", 2);
        addList(list, "중간", 1);

        list.remove(1); // 1에 삽입한 "중간" 제거

        printList(list);

        /* 사이즈, 위치 값 */
        System.out.println("리스트 사이즈 : " + list.size());
        System.out.println("처음 꺼내기 : " + list.get(0));

        /* 검색 */
        System.out.println("처음 검색 : " + list.contains("처음"));
        System.out.println("끝이 있으면 index 반환 : " + list.indexOf("끝"));
        removeList(list, "끝");
        System.out.println("끝이 없으면 -1 반환 : " + list.indexOf("끝"));
        printList(list);

        /* 원하는 요소 앞에 추가 */
        int index = list.indexOf(null);
        addList(list, "중간", index);
        printList(list);
    }

    private static void addList(ArrayList list, String str) {
        list.add(str);
        System.out.println("list에 " + str + " 문자가 삽입되었습니다.");
    }

    private static void addList(ArrayList list, String str, int index) {
        list.add(index, str);
        System.out.println("list의 " + index + " 위치에 " + str + " 문자가 삽입되었습니다.");
    }

    private static void removeList(ArrayList list, String str) {
        list.remove(str);
        System.out.println("list에 " + str + " 문자가 삭제되었습니다.");
    }

    /* 모든 요소 출력 */
    private static void printList(ArrayList list){
        System.out.println("-------------------");
        for (Object object : list) {
            System.out.println("object : " + object);
        }
        System.out.println("-------------------");
    }
}