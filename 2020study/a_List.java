import java.util.*;

/**
 * List를 이용한 반복문은 두 가지가 존재한다.
 * - iterator 사용
 * - for(Object object : list)
 */

public class a_List {
    public static void main(String[] args) {
        var listA = new ArrayList<>();

        // 삽입부
        listA.add("처음");
        listA.add("끝");
        listA.add(1, "중간"); // index 위치 삽입

        var iterator = listA.iterator();

        // 1. iterator 반복
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.println(element);
        }
        System.out.println("------------------------");
        // 2. for 반복
        for(Object object : listA){
            String element = (String) object;
            System.out.println(element);
        }

    }
}
